public class PokemonC extends Pokemon{
    private int exp=25;
    public PokemonC(){
        super("");
        setStatus(60, 60, 15);
    }
    public int getExp(){
        return exp;
    }
}