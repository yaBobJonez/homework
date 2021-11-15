---
layout: default
title: Расписание
nav_order: 2
description: "Информационный сайт 11-А класса."
has_toc: false
---

<head>
<style>
table, td, th {
	border: 1px solid #404040;
	border-collapse: collapse;
}
table tr:nth-child(odd) {
	background-color: #e0e0e0;
} table tr:nth-child(even) {
	background-color: #f0f0f0;
} table th {
	background-color: #3b3b3b;
	color: #ffffff;
}
table {
	box-shadow: 0px 0px 8px #bababa;
}
</style>
</head>

## Расписание 11-A на Этой Неделе:

<table style="width:100%;">
	<tr>
		<th>N</th>
		<th>Період</th>
		<th>ПН</th>
		<th>ВТ</th>
		<th>СР</th>
		<th>ЧТ</th>
		<th>ПТ</th>
	</tr>
	<tr>
		<td>1</td>
		<td>8:30</td>
		<td>Астро.</td>
		<td>Фізика</td>
		<td>Геометрія</td>
		<td>Фізика</td>
		<td>Інформат.</td>
	</tr>
	<tr>
		<td>2</td>
		<td>9:25</td>
		<td>Географ.</td>
		<td>Іст. Укр.</td>
		<td>Геометр.</td>
		<td>Фізика</td>
		<td>Інформат.</td>
	</tr>
	<tr>
		<td>3</td>
		<td>10:20</td>
		<td>Хімія</td>
		<td>Іст. Укр.</td>
		<td>Eng/Укр</td>
		<td>Хімія</td>
		<td>Укр. літ.</td>
	</tr>
	<tr>
		<td>4</td>
		<td>11:20</td>
		<td>Алгебра</td>
		<td>Біологія</td>
		<td>Eng/Укр</td>
		<td>Заруб.</td>
		<td>Укр. Літ.</td>
	</tr>
	<tr>
		<td>5</td>
		<td>12:25</td>
		<td>Алгебра</td>
		<td>Русский</td>
		<td>Інформат.</td>
		<td><div id="Thu">Всесв./Зах.</div></td>
		<td>Алгебра</td>
	</tr>
	<tr>
		<td>6</td>
		<td>13:20</td>
		<td>Укр/Eng</td>
		<td>Русский</td>
		<td>Інформат.</td>
		<td>Всесв.</td>
		<td>Алгебра</td>
	</tr>
	<tr>
		<td>7</td>
		<td>14:10</td>
		<td>Укр/Eng</td>
		<td>Фіз–ра</td>
		<td>Фіз–ра</td>
		<td>Вальс</td>
		<td>Біологія</td>
	</tr>
	<tr>
		<td>8</td>
		<td>15:00</td>
		<td>Захист</td>
		<td>Інформат.</td>
		<td>—</td>
		<td>Фітнес</td>
		<td>—</td>
	</tr>
</table>

<!-- Паша, что ты тут забыл? -->
<script>
	function getMonday(d) {
		var diff = d.getDate() - d.getDay() + (d.getDay() === 0 ? -6 : 1);
		return new Date(d.setDate(diff)).getDate();
	}
	var mon = getMonday(new Date());
	var thu = mon % 2 == 0? "Всесвітня Історія" : "Захист";
	document.getElementById("Thu").innerHTML = thu;
</script>

