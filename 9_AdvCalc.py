from enum import Enum

class TokenList(Enum):
	INT=1
	DOUBLE=2
	ADD=3
	SUBTRACT=4
	MULTIPLY=5
	DIVIDE=6
	MODULO=7
	POWER=8
	EOF=0
class Token:
	typeV = None; value = None
	def __init__(self, typeV, value):
		self.typeV = typeV
		self.value = value
	def __str__(self):
		return "Token["+self.typeV+": "+self.value+"]"
class Statement:
	def eval():
		pass
class ValueNode(Statement):
	value = None
	def __init__(self, value):
		self.value = value
	def eval(self):
		return self.value
class UnaryNode(Statement):
	operator = None; right = None
	def __init__(self, operator, right):
		self.operator = operator
		self.right = right
	def eval(self):
		if self.operator == '-': return -self.right.eval()
		else: raise Exception("Невідомий оператор: "+self.operator)
class BinaryNode(Statement):
	left = None; operator = None; right = None
	def __init__(self, left, operator, right):
		self.left = left
		self.operator = operator
		self.right = right
	def eval(self):
		left = self.left.eval()
		right = self.right.eval()
		if self.operator == '+': return left + right
		elif self.operator == '-': return left - right
		elif self.operator == '*': return left * right
		elif self.operator == '/': return left / right
		elif self.operator == '%': return left % right
		elif self.operator == '^': return left ** right
		else: raise Exception("Невідомий оператор: "+self.operator)
class Lexer:
	position = None; curr_char = None
	inputStr = None; size = None
	def __init__(self, inputStr):
		self.inputStr = inputStr
		self.size = len(inputStr)
		self.position = -1
		self.advance()
	def advance(self):
		self.position += 1
		if self.position >= self.size: self.curr_char = '\0'
		else: self.curr_char = self.inputStr[self.position]
	def tokenize(self):
		tokens = []
		while self.curr_char != '\0':
			if self.curr_char == ' ': self.advance()
			elif self.curr_char in "0123456789": tokens.append(self.buildNumber())
			elif self.curr_char == '+':
				tokens.append(Token(TokenList.ADD, 0))
				self.advance()
			elif self.curr_char == '-':
				tokens.append(Token(TokenList.SUBTRACT, 0))
				self.advance()
			elif self.curr_char == '*':
				tokens.append(Token(TokenList.MULTIPLY, 0))
				self.advance()
			elif self.curr_char == '/':
				tokens.append(Token(TokenList.DIVIDE, 0))
				self.advance()
			elif self.curr_char == '%':
				tokens.append(Token(TokenList.MODULO, 0))
				self.advance()
			elif self.curr_char == '^':
				tokens.append(Token(TokenList.POWER, 0))
				self.advance()
			else: raise Exception("Невідомий символ: "+self.curr_char)
		tokens.append(Token(TokenList.EOF, 0))
		return tokens
	def buildNumber(self):
		number = ""
		point = False
		while self.curr_char in "0123456789.":
			if self.curr_char == '.':
				if point == True: break
				else:
					point = True
					number += "."
			else: number += self.curr_char
			self.advance()
		if point == True: return Token(TokenList.DOUBLE, float(number))
		else: return Token(TokenList.INT, int(number))
class Parser:
	tokens = None
	position = None; size = None
	def __init__(self, tokens):
		self.tokens = tokens
		self.position = 0
		self.size = len(tokens)
	def parse(self):
		return self.addition()
	def addition(self):
		result = self.multiplication()
		while True:
			if self.matches(TokenList.ADD):
				result = BinaryNode(result, '+', self.multiplication())
				continue
			elif self.matches(TokenList.SUBTRACT):
				result = BinaryNode(result, '-', self.multiplication())
				continue
			break
		return result
	def multiplication(self):
		result = self.power()
		while True:
			if self.matches(TokenList.MULTIPLY):
				result = BinaryNode(result, '*', self.power())
				continue
			elif self.matches(TokenList.DIVIDE):
				result = BinaryNode(result, '/', self.power())
				continue
			break
		return result
	def power(self):
		result = self.unary()
		while True:
			if self.matches(TokenList.MODULO):
				result = BinaryNode(result, '%', self.unary())
				continue
			elif self.matches(TokenList.POWER):
				result = BinaryNode(result, '^', self.unary())
				continue
			break
		return result
	def unary(self):
		if self.matches(TokenList.SUBTRACT): return UnaryNode('-', self.valueF())
		return self.valueF()
	def valueF(self):
		curr = self.getToken(0)
		if self.matches(TokenList.INT) or self.matches(TokenList.DOUBLE):
			return ValueNode(curr.value)
		else: raise Exception("Недійсне значення "+self.getToken(0).typeV+": "+self.getToken(0).value)
	def matches(self, typeV):
		if self.getToken(0).typeV != typeV: return False
		self.position += 1
		return True
	def getToken(self, rel_pos):
		curr_position = self.position + rel_pos
		if curr_position >= self.size: return Token(TokenList.EOF, 0)
		return self.tokens[curr_position]
	def consume(self, typeV):
		curr_token = self.getToken(0)
		if curr_token.typeV != typeV: raise Exception("Неочікуваний токен: "+curr_token)
		self.position += 1
		return curr_token

def main():
	while True:
		inputStr = input("> ")
		if inputStr == "exit" or not inputStr: exit()
		lx = Lexer(inputStr)
		pr = Parser(lx.tokenize())
		print("< " + str(pr.parse().eval()))
if __name__ == "__main__": main()
