package JavaViradoNoJiraya.Fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean

        // Todos os tipos primitivos com exceção do Boolean, são numéricos;

        int idade = 20;
        long numeroGrande = 100000;
        double salarioDouble = 2500;
        float salarioFloat = 2500;
        short idadeShort = 10;
        byte idadeByte = 10;
        boolean verdade = true;
        boolean falso = false;
        char caractere = '\u0040';

        System.out.println("idade: " + idade);

        /*
         * Este comentário descreve os tipos de dados primitivos em Java,
         * suas características de armazenamento, o intervalo de valores que podem conter
         * e seus valores padrão.
         *
         * Em Java, os tipos de dados são categorizados em primitivos e não-primitivos.
         * A tabela abaixo foca nos tipos de dados primitivos.
         *
         * ------------------------------------------------------------------------------------------------------
         * | Data Type | Size      | Range of values that can be stored                         | Default value |
         * ------------------------------------------------------------------------------------------------------
         * | byte      | 1 byte    | -128 to 127                                                | 0             |
         * | short     | 2 bytes   | -32768 to 32767                                            | 0             |
         * | int       | 4 bytes   | -2,147,483,648 to 2,147,483,647                            | 0             |
         * | long      | 8 bytes   | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807    | 0L            |
         * | float     | 4 bytes   | 3.4e-038 to 3.4e+038 (aproximadamente)                     | 0.0f          |
         * | double    | 8 bytes   | 1.7e-308 to 1.7e+038 (aproximadamente)                     | 0.0d          |
         * | boolean   | 1 bit     | true or false                                              | false         |
         * | char      | 2 bytes   | '\u0000' to '\uffff' (representa caracteres Unicode)       | '\u0000'      |
         * ------------------------------------------------------------------------------------------------------
         *
         * Detalhamento dos tipos:
         *
         * Tipos Integrais (números inteiros):
         * - byte: O menor tipo inteiro. Útil para economizar memória em grandes arrays
         * ou quando o intervalo de valores é pequeno.
         * - short: Maior que um byte, mas menor que um int. Também pode ser usado
         * para economizar memória.
         * - int: O tipo inteiro mais comumente usado. Suficiente para a maioria das
         * situações.
         * - long: Usado para números inteiros muito grandes, quando um 'int' não é
         * suficiente. O literal 'long' geralmente é seguido por 'L' ou 'l' (ex: 100L).
         *
         * Tipos de Ponto Flutuante (números decimais):
         * - float: Representa números de ponto flutuante de precisão simples.
         * O literal 'float' é seguido por 'f' ou 'F' (ex: 3.14f).
         * - double: Representa números de ponto flutuante de precisão dupla.
         * É o tipo decimal padrão em Java e é o mais comumente usado.
         * O literal 'double' pode ser seguido por 'd' ou 'D' (ex: 2.718d),
         * mas é opcional.
         *
         * Tipo Lógico:
         * - boolean: Armazena apenas dois valores: 'true' ou 'false'.
         * Usado para operações lógicas e controle de fluxo.
         *
         * Tipo Caractere:
         * - char: Armazena um único caractere Unicode de 16 bits. Pode representar
         * qualquer caractere da tabela Unicode. O valor padrão '\u0000'
         * representa o caractere nulo.
         *
         * É crucial entender esses tipos para otimizar o uso da memória e garantir
         * que as variáveis possam armazenar os valores esperados sem estouro (overflow)
         * ou subfluxo (underflow).
         */
    }
}
