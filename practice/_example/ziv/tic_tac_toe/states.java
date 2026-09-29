package practice._example.ziv.tic_tac_toe;

public enum states {
    EMPTY(' '),
    O('o'),
    X('x');
    char symbol;
    private states(char symbol)
    {
        this.symbol=symbol;
    }
    public char Get_symbol(){
        return symbol;
    }
    
}
