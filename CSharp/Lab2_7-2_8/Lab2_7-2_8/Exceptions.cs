namespace Lab2_7_2_8;

class LnNotGreaterThanZeroException : Exception {
    public override string Message
    {
        get => "Натуральний логарифм менше або дорівнює нулю!";
    }
}
