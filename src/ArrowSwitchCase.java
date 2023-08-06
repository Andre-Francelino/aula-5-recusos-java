public class ArrowSwitchCase {
    public static void main(String[] args) {
        var estiloRock = "NWOBHM";

        System.out.println("O estilo escolhido foi o " + estiloRock + ", abaixo uma sugestão de banda para ouvir:");

        switch (estiloRock) {
            case "Heavy":
                System.out.println("Iron Maiden - Up the Iron's");
                break;
            case "Thrash":
                System.out.println("Metallica - O disco de estréia Kill 'Em All é um dos mais importantes na história do Thrash Metal.");
                break;
            case "Death Metal":
                System.out.println("Death - Chuck Schuldiner foi um gênio do estilo.");
                break;
            case "Black Metal":
                System.out.println("Venom - banda importantíssima para o som pesado.");
                break;
            case "Progressive":
                System.out.println("RUSH - Um power-trio formado por aliénigenas. Uma das minhas bandas favoritas!");
                break;
            case "NWOBHM":
                System.out.println("Saxon - Heavy Metal ideal para ouvir encarando a estrada em uma moto!");
                break;
            case "Crossover":
                System.out.println("R.D.P - O Ratos de Porão sem sombra de dúvidas é um dos expoentes no " +
                        "estilo e não deve nada às bandas gringas!");
                break;
            case "Punk":
                System.out.println("Ramones - Os reis do punk rock!");
                break;
            case "Grind":
                System.out.println("Terrorizer - Podridão cru e direta no seu ouvido!");
                break;
            default:
                System.out.println("");
                break;
        }

        /*
            Usando a sintaxe do ARROW reduz bastante a quantidade de linhas comparado ao switch case escrito acima
          Porém essa sintaxe é utíl apenas quando for tratar uma uníca linha por caso, se for necessário mais de uma
          linha para cada caso, essa expressão Arrow abaixo não atenderá, e com isso, será necessário utilizar o Switch case comum.
                                                                                                                                    * */
        switch (estiloRock) {
            case "Heavy" -> System.out.println("Iron Maiden - Up the Iron's");
            case "Thrash" -> System.out.println("Metallica - O disco de estréia Kill 'Em All é um dos mais importantes na história do Thrash Metal.");
            case "Death Metal" -> System.out.println("Death - Chuck Schuldiner foi um gênio do estilo.");
            case "Black Metal" -> System.out.println("Venom - banda importantíssima para o som pesado.");
            case "Progressive" -> System.out.println("RUSH - Um power-trio formado por aliénigenas. Uma das minhas bandas favoritas!");
            case "NWOBHM" -> System.out.println("Saxon - Heavy Metal ideal para ouvir encarando a estrada em uma moto!");
            case "Crossover" -> System.out.println("R.D.P - O Ratos de Porão sem sombra de dúvidas é um dos expoentes no " +
                    "estilo e não deve nada às bandas gringas!");
            case "Punk" -> System.out.println("Ramones - Os reis do punk rock!");
            case "Grind" -> System.out.println("Terrorizer - Podridão cru e direta no seu ouvido!");
        }

    }
}
