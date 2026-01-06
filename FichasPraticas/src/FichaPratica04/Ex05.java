package FichaPratica04;

public class Ex05 {

     "id": 1,
        //     "question": "O programa seguinte permite analisar uma nota inserida pelo utilizador e imprime na consola a classificação qualificativa (Excelente, Muito Bom, Bom, Suficiente e Negativa), sem erros de compilação:",
      //       "code": "Scanner input = new Scanner(System.in);\ndouble nota;\n\nSystem.out.print(\"Insira a nota na UFCD: \");\nnota = input.nextDouble();\n\nif (nota >= 18) {\n    System.out.println(\"Excelente\");\n} else if (nota >= 15) {\n    System.out.println(\"Muito Bom\");\n} else if (nota >= 12) {\n    System.out.println(\"Bom\");\n} else if (nota >= 9.5) {\n    System.out.println(\"Suficiente\");\n} else {\n    System.out.println(\"Negativa\");\n}",
       //      "type": "single_choice",
       //      "options": ["Verdadeiro", "Falso"],
    ///"correct_answer": "Verdadeiro"

        {
        "id": 2,
       // "question": "Selecione os nomes de variáveis inválidos. (Selecione uma ou mais opções)",
       // "type": "multiple_selection",
       // "options": ["double", "int10", "var_int", "!var", "VAR", "while", "10int", "var1", "a", "_var1", "Var"],
        /// "correct_answers": ["double", "!var", "while", "10int" "]
        },
        {

        "id": 3,
        //"question": "Em programação, uma variável é:",
       // "type": "single_choice",
        //"options": [
        //"Um tipo complexo de dados, podendo ser mono ou multidimensional.",
       // "Um local de armazenamento de um valor que é constante ao longo da execução do programa.",
        //"Um local de armazenamento de um valor que não é fixo ao longo da execução do programa.",
       // "Um tipo de dados que não é fixo ao longo da execução do programa.",
        //"Composta por um nome, um endereço, um tipo de dados e um valor. Devem ser inicializadas antes de serem declaradas."
        ],
        ///"correct_answer": "Um local de armazenamento de um valor que não é fixo ao longo da execução do programa."
        },
        {

        "id": 4,
       //"question": "O seguinte programa deve ler três números inteiros e imprimir os mesmos em ordem crescente. Para tal, complete a linha em falta:",
       // "code": "if (num1 > num2) {\n    temp = num1;\n    __________________\n    num2 = temp;\n}",
        //"type": "single_choice",
        //"options": [
        //"num1 = num2;",
        //"num3 = num1 - num2;",
        //"Nenhuma das opções está correta.",
        //"num3 = num1 - num3;",
        //"num3 = num2;",
        //"num2 = num3;",
        //"num1 = temp;",
        //"num2 = num1;"
        ],
        ///"correct_answer": "num1 = num2;"
        },
        {

        "id": 5,
        //"question": "Como se pode atribuir um valor a uma variável em JAVA?",
        //"type": "single_choice",
        //"options": ["change x value to 10;", "x <= 10;", "Nenhuma das opções está correta.", "variable x = 10;", "set x value as 10;", "x = 10;", "10 = x;"],
        ///"correct_answer": "x = 10;"
        },
        {

        "id": 6,
        "question": "Qual a finalidade de um ciclo?",
        "type": "single_choice",
        "options": [
        "Executar uma ou mais ações repetidamente enquanto uma determinada condição for falsa.",
        "Executar uma ou mais ações repetidamente enquanto uma determinada condição for verdadeira.",
        "Não executar nenhuma ação.",
        "Executar uma ação uma única vez."
        ],
        // "correct_answer": "Executar uma ou mais ações repetidamente enquanto uma determinada condição for verdadeira."
        },
        {


        "id": 7,
        "question": "O seguinte programa permite analisar um número inteiro. Para tal, complete a linha em falta:",
        "code": "Scanner input = new Scanner(System.in);\n__________________\n\nSystem.out.print(\"Introduza um número: \");\nint numero = input.nextInt();",
        "type": "single_choice",
        "options": ["int numero, opcao;", "int numero;", "Nenhuma das respostas fará o programa compilar corretamente.", "int opcao;"],
        //"correct_answer": "Nenhuma das respostas fará o programa compilar corretamente." ou //int opcao
        },
        {


        "id": 8,
        "question": "Qual o tipo de dados usado para armazenar números reais em JAVA?",
        "type": "single_choice",
        "options": ["boolean", "String", "int", "real", "Nenhuma das opções permite armazenar números reais."],
        // "correct_answer": "Nenhuma das opções permite armazenar números reais."
        },
        {


        "id": 9,
        "question": "Qual dos seguintes operadores aritméticos pode ser usado em variáveis do tipo número inteiro?",
        "type": "single_choice",
        "options": ["Soma (+)", "Divisão (/)", "Multiplicação (*)", "Todas as opções estão corretas.", "Resto da Divisão (%)", "Subtração (-)"],
        //"correct_answer": "Todas as opções estão corretas."
        },
        {


        "id": 10,
        "question": "Como podemos definir, geralmente, um algoritmo?",
        "type": "single_choice",
        "options": [
        "Aplicação destinada a desenvolvimento de programas em diferentes linguagens.",
        "Programa escrito em linguagem Java.",
        "Um problema computacional.",
        "Conjunto de diretrizes que descreve como realizar uma tarefa ou resolver um problema.",
        "Programa escrito em qualquer linguagem de programação."
        ],
        //"correct_answer": "Conjunto de diretrizes que descreve como realizar uma tarefa ou resolver um problema."
        },
        {


        "id": 11,
        "question": "Como podemos avaliar mais de uma condição na estrutura \"if\"?",
        "type": "single_choice",
        "options": [
        "Não é possível avaliar mais de uma condição.",
        "Usando o operador lógico \"/\".",
        "Usando o operador aritmético \"+\".",
        "Usando apenas uma estrutura \"if\".",
        "Usando operadores lógicos como \"&&\" e \"||\".",
        "Usando o operador \"==\"."
        ],
        // "correct_answer": "Usando operadores lógicos como "&&" e "||".
        },
        {


        "id": 12,
        "question": "O seguinte programa deve apresentar a tabuada de um número inserido pelo utilizador. Para tal, complete a linha em falta:",
        "code": "while (contador <= 10) {\n    __________________\n    System.out.println(numero + \" x \" + contador + \" = \" + resultado);\n    contador++;\n}",
        "type": "single_choice",
        "options": [
        "Nenhuma das opções está correta.",
        "resultado = numero * resultado;",
        "resultado = contador * resultado;",
        "numero = resultado * contador;",
        "resultado = numero * contador;",
        "numero = numero * contador;"
        ],
        //  "correct_answer": "resultado = numero * contador;"
        },
        {


        "id": 13,
        "question": "Preencha corretamente a linha 1. e 2. com as linhas de código corretas.",
        "code": "1. __________________\nSystem.out.println(\"Área: \" + area + \"m2.\");\n2. __________________\nSystem.out.println(\"Perímetro: \" + perimetro + \"m.\");",
        "type": "single_choice",
        "options": [
        "1. perímetro = (2 * comprimento) + (2 * largura); 2. area = comprimento * largura;",
        "1. perímetro = comprimento * largura; 2. area = (2 * comprimento) + (2 * largura);",
        "1. area = (comprimento * largura) / 10000; 2. perimetro = 2 * (comprimento + largura) / 100;",
        "1. area = perimetro = 2 * (comprimento + largura) / 100; 2. area = (comprimento * largura) / 100;",
        "1. area = comprimento * largura; 2. perímetro = (2 * comprimento) + (2 * largura);",
        "1. area = (comprimento * largura) / 100; 2. perimetro = 2 * (comprimento + largura) / 100;",
        "1. area = (2 * comprimento) + (2 * largura); 2. perímetro = comprimento * largura;",
        "1. area = perimetro = 2 * (comprimento + largura) / 100; 2. area = (comprimento * largura) / 10000;"
        ],
        //"correct_answer": "1. area = comprimento * largura;
        //2. perímetro = (2 * comprimento) + (2 * largura);"
        },
        {


        "id": 14,
        "question": "O que é um Paradigma de Programação?",
        "type": "single_choice",
        "options": [
        "Uma ferramenta usada para executar um bloco de código várias vezes.",
        "Um algoritmo paradigmático orientado para programas de computador.",
        "Um algoritmo paradigmático orientado para resolução de problemas computacionais.",
        "Uma linguagem de programação.",
        "Nenhuma das opções está correta.",
        "Meio de classificar linguagens de programação baseado nas suas funcionalidades."
        ],
        //"correct_answer": "Meio de classificar linguagens de programação baseado nas suas funcionalidades."
        },
        {


        "id": 15,
        "question": "Qual o output do seguinte programa?",
        "code": "String opcao = 1;\nswitch (opcao) {\n    case 1:\n        System.out.println(\"Primeira Opcao\");\n        break;\n    // ...\n}",
        "type": "single_choice",
        "options": ["Nenhuma das opções está correta.", "Inválida", "Segunda Opcao", "Primeira Opcao"],
        // "correct_answer": "Nenhuma das opções está correta."
        },
        {


        "id": 16,
        "question": "Após a execução do seguinte código, qual o valor da variável resultado?",
        "code": "int a = 3, b = 4, resultado = 0;\nif (a < b) {\n    resultado = a++ * b;\n} else {\n    resultado = a + b;\n}",
        "type": "single_choice",
        "options": ["12", "7", "0", "1", "3", "Nenhuma das opções está correta."],
        // "correct_answer": "12"
        },
        {


        "id": 17,
        "question": "O seguinte programa deve apresentar um preço de um produto com 60% de desconto, caso o preço seja igual ou superior a 250€. Complete a linha em falta:",
        "code": "if (precoProduto >= 250) {\n    __________________\n}\nSystem.out.println(\"Preço Final: \" + precoProduto);",
        "type": "single_choice",
        "options": [
        "precoProduto *= 0.4;",
        "precoProduto *= precoProduto - (precoProduto * 0.6);",
        "precoProduto *= precoProduto * 0.6;",
        "precoProduto = precoProduto * 0.6;",
        "precoProduto *= precoProduto * 0.4;",
        "Nenhuma das opções está correta.",
        "precoProduto *= 0.6;"
        ],
        //"correct_answer": "precoProduto *= 0.4;"
        },
        {


        "id": 18,
        "question": "O seguinte código é respetivo a um jogo de adivinhar o número secreto... Complete os operadores em falta pela respetiva ordem.",
        "code": "// 1. Parabéns! Acertou (palpite 1._ numeroMisterioso)\n// 2. O número misterioso é maior (palpite 2._ numeroMisterioso)\n// 3. Parabéns! Acertou (palpite 3._ numeroMisterioso)\n// 4. O número misterioso é maior (palpite 4._ numeroMisterioso)",
        "type": "single_choice",
        "options": [
        "1. !=   2. >   3. !=   4. >",
        "1. ==   2. >   3. ==   4. >",
        "1. <    2. <   3. >    4. >",
        "1. ==   2. <   3. ==   4. <",
        "1. >    2. <   3. >    4. <",
        "Nenhuma das opções está correta.",
        "1. !=   2. <   3. !=   4. <"
        ],
        //"correct_answer": "1. ==   2. <   3. ==   4. <"
        },
        {


        "id": 19,
        "question": "O output, na consola, do seguinte programa é:",
        "code": "int i = 10;\nint count = 1;\nwhile (i > 0) {\n    if (i % 2 == 0 && i > 0) {\n        count++;\n        count--;\n        count++;\n    }\n    i--;\n}\nSystem.out.print(\"A contagem de números pares de 1 a 10 é: \");\nSystem.out.println(count);",
        "type": "single_choice",
        "options": [
        "Não há nenhuma entrada de dados ou output na consola.",
        "A contagem de números pares de 1 a 10 é: 30",
        "A contagem de números pares de 1 a 10 é: 10",
        "A contagem de números pares de 1 a 10 é: 6",
        "A contagem de números pares de 1 a 10 é: 5",
        "A contagem de números pares de 1 a 10 é: 20",
        "A contagem de números pares de 1 a 10 é: 4"
        ],
        //"correct_answer": "A contagem de números pares de 1 a 10 é: 6"
        },
        {


        "id": 20,
        "question": "Usamos um IDE (Integrated Development Environment) para:",
        "type": "single_choice",
        "options": [
        "Comunicar em equipa quando estamos a desenvolver um projeto de software.",
        "Elaborar apresentações de projetos de software, uma vez que permitem a criação de conteúdo multimédia.",
        "Criar repositórios que facilitam o desenvolvimento de sofware e trabalho em equipa, controlando as várias contribuições dos diversos membros.",
        "Desenvolver projetos de software, uma vez que permitem a escrita de programas, tradução para linguagem máquina e debug.",
        "Consultar bibliotecas de linguagens de programação."
        ],
        // "correct_answer": "Desenvolver projetos de software, uma vez que permitem a escrita de programas, tradução para linguagem máquina e debug."
        },
        {


        "id": 21,
        "question": "Preencha as linhas em falta de modo que o programa calcule a soma dos números impares entre 1 e 100:",
        "code": "while (numero <= 100) {\n    1. __________________\n    2. __________________\n}",
        "type": "single_choice",
        "options": [
        "1. soma = soma + 2; 2. numero = numero + 2;",
        "1. soma = soma + numero; 2. numero = numero + 2;",
        "1. if(numero % 3 == 0) 2. soma = soma + numero;",
        "1. if(numero % 2 != 0) 2. soma = soma + numero;",
        "Nenhuma das opções está correta.",
        "1. if(numero % 3 == 0) 2. numero= soma + numero;"
        ],
        // "correct_answer": "1. soma = soma + numero; 2. numero = numero + 2;"
        },
        {


        "id": 22,
        "question": "Num computador, o hardware define:",
        "type": "single_choice",
        "options": [
        "Nenhuma das opções está correta.",
        "O sistema operativo instalado.",
        "A componente física do computador.",
        "Um programa de computador.",
        "Um IDE (Integrated Development Environment).",
        "A componente lógica do computador.",
        "Um paradigma de programação."
        ],
        // "correct_answer": "A componente física do computador."
        },
        {


        "id": 23,
        "question": "De acordo com as regras e boas práticas, devo nomear um variável String, que guarda o nome do utilizador, de:",
        "type": "single_choice",
        "options": ["NomeUtilizador", "NOME_UTILIZADOR", "n", "_nome_utilizador", "nomeUtilizador", "Nome_Utilizador"],
        // "correct_answer": "nomeUtilizador"
        },
        {


        "id": 24,
        "question": "Numa estrutura de escolha (switch) são executadas as ações:",
        "type": "single_choice",
        "options": [
        "De forma aleatória, não havendo forma de prever quais as ações a serem executadas.",
        "Apenas correspondentes à primeira condição que seja falsa.",
        "Apenas correspondentes à primeira condição que seja verdadeira.",
        "Correspondentes a todas as condições que sejam falsas.",
        "Correspondentes a todas as condições que sejam verdadeiras."
        ],
        //"correct_answer": "Apenas correspondentes à primeira condição que seja verdadeira."
        },
        {


        "id": 25,
        "question": "Foi elaborado o seguinte código, complete a linha em branco com a opção correta.",
        "code": "for(int i = 1; i <= 10; i++){\n    __________________\n}",
        "type": "single_choice",
        "options": [
        "System.out.println(num + \" x \" + i + \" + \" = \" + (num * i));",
        "Nenhuma está das opções correta",
        "System.out.println((num * i) + \" x \" + i + \" = \" + (num / i));",
        "System.out.println((num x i) + \" = \" + (num * i));",
        "System.out.println(num + \" x \" + i + \" = \" + (num / i*10));"
        ],
        //"correct_answer": "System.out.println(num + " x " + i + " = " + (num * i));"
        },
        {


        "id": 26,
        "question": "Qual das seguintes não faz parte do Ciclo de Desenvolvimento de um Programa? (Selecione uma ou mais opções)",
        "type": "multiple_selection",
        "options": [
        "Instalação do IDE (Exemplo: IntelliJ IDEA).",
        "Criação e Ativação de Conta na Jetbrains.",
        "Definição e Análise do Problema.",
        "Configuração do JDK mais recente.",
        "Testes e Depuração.",
        "Programação.",
        "Documentação.",
        "Atualização para a versão mais recente do Sistema Operativo.",
        "Pesquisa da Solução na Web.",
        "Manutenção.",
        "Desenvolvimento do Algoritmo."
        ],
        //"correct_answers": [
        // "Instalação do IDE (Exemplo: IntelliJ IDEA).",
        // "Criação e Ativação de Conta na Jetbrains.",
        //"Atualização para a versão mais recente do Sistema Operativo."
        ]
        },
        {


        "id": 27,
        "question": "O seguinte programa deve apresentar na consola os números exponenciais (2 4 8 16 32...). Complete a linha em falta:",
        "code": "int valor = 2, count = 1;\nwhile (valor <= 10000) {\n    System.out.println(valor);\n    __________________\n    count++;\n}",
        "type": "single_choice",
        "options": [
        "Nenhuma das opções está correta.",
        "valor = valor * count;",
        "valor++;",
        "count = count + valor;",
        "count = valor * 2;",
        "valor = valor + count;"
        ],
        // "correct_answer": "Nenhuma das opções está correta."
        },
        {


        "id": 28,
        "question": "O seguinte programa imprime os números na consola desde o:",
        "code": "int contador = 20;\nwhile (contador > 1) {\n    System.out.println(contador);\n    contador--;\n}",
        "type": "single_choice",
        "options": ["1 até o 20", "1 até o 19", "Nenhuma das opções está correta.", "2 até o 20", "20 até o 1"],
        // "correct_answer": "Nenhuma das opções está correta."
        },
        {


        "id": 29,
        "question": "Qual das expressões abaixo verifica se idade está entre 18 e 65 (inclusive)?",
        "type": "single_choice",
        "options": [
        "idade == 18 && idade == 65",
        "idade > 18 || idade < 65",
        "Nenhuma das opções está correta.",
        "idade >= 18 || idade <= 65",
        "idade >= 18 && idade <= 65",
        "idade < 18 && idade > 65",
        "idade > 18 && idade < 65"
        ],      //"correct_answer": "idade >= 18 && idade <= 65"
        },
        {


        "id": 30,
        "question": "O seguinte programa deve converter uma temperatura em Graus Celsius para Graus Fahrenheit. Complete a linha em falta:",
        "code": "// Fórmula de Conversão: °F = (9/5 x °C) + 32.\n// ...\nSystem.out.println(celsius + \" graus Celsius é igual a \" + fahrenheit + \" graus Fahrenheit.\");",
        "type": "single_choice",
        "options": [
        "fahrenheit = 32 + (celsius * 9/5);",
        "celsius = (fahrenheit * 9/5) + 32;",
        "celsius = 32 + (fahrenheit * 9/5);",
        "celsius = (5/9 * fahrenheit) + 32;",
        "fahrenheit = (5/9 * celsius) + 32;"
        ],
        //"correct_answer": "fahrenheit = 32 + (celsius * 9/5);"
        },
        {
            

        "id": 31,
        // "question": "No final da execução do seguinte programa, qual o aspeto da consola?",
        // "code": "int a = 1, b = 2, c = 3;\na = a + b * c;\nb = c;\nSystem.out.println(a + b);",
        // "type": "single_choice",
        // "options": ["73", "12", "3", "93", "-10", "Nenhuma das opções está correta."],
        ///  "correct_answer": "Nenhuma das opções está correta."
        }
        ]


        }
}