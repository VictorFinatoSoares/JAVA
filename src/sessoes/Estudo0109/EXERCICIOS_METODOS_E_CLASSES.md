# Exercícios de fixação sobre métodos e classes

## Condições de conclusão

Em todos os exercícios, utilize métodos `static`. O método `main` deve chamar os métodos criados; evite concentrar toda a lógica nele. Ainda não use objetos, atributos ou construtores.

**Exercício 0:** Faça um programa que lê um número inteiro e imprime na tela se este número é par ou ímpar.
Crie um método que recebe o número e devolve se ele é par ou ímpar.

**Exercício 1:** Faça um programa que lê três números inteiros e imprime na tela o maior deles. 
Crie um método que recebe os três números e devolve o maior valor.

**Exercício 2:** Faça um programa que lê duas notas, calcula a média e imprime a situação do estudante.
O estudante deve ser aprovado com média maior ou igual a 7, ficar em recuperação com média maior ou igual a 5 e menor que 7, 
ou ser reprovado nos demais casos. Crie um método para calcular a média e outro para informar a situação.

**Exercício 3:** Faça um programa que lê um número inteiro positivo e imprime a tabuada deste número de 1 até 10.
A impressão da tabuada deve ser realizada por um método que recebe o número informado.

**Exercício 4:** Faça um programa que lê um número inteiro não negativo e imprime o seu fatorial.
Crie um método que recebe o número e devolve seu fatorial. Caso o número informado seja negativo, imprima uma mensagem de erro.

**Exercício 5:** Faça um programa que apresenta um menu com as opções de converter uma temperatura de
Celsius para Fahrenheit, converter uma temperatura de Fahrenheit para Celsius ou encerrar o programa.
Crie um método para cada conversão. O menu deve continuar sendo apresentado até que a opção de encerrar seja escolhida.

**Exercício 6:** Faça um programa que lê dois números e uma operação matemática (`+`, `-`, `*` ou `/`) 
e imprime o resultado da operação. Crie um método para somar, um para subtrair, um para multiplicar e um para dividir.
Caso seja solicitada uma divisão por zero, imprima uma mensagem de erro.

**Exercício 7:** Faça um programa que cria um array unidimensional de inteiros com dimensão informada
pelo usuário e preenche-o com valores obtidos pelo teclado.
Em seguida, imprima o maior valor, o menor valor e a média dos elementos do array.
Crie métodos para preencher o array, encontrar o maior valor, encontrar o menor valor e calcular a média.

**Exercício 8:** Faça um programa que cria um array unidimensional de inteiros,
preenche-o com valores obtidos pelo teclado e pede para o usuário informar um valor a ser procurado.
O programa deve imprimir todas as posições em que o valor aparece no array.
Caso o valor não esteja no array, imprima uma mensagem informando isto. 
Crie um método que conta as ocorrências e outro que imprime as posições encontradas.

**Exercício 9:** Faça um programa que cria um array bidimensional de inteiros com dimensões
informadas pelo usuário e preenche-o com valores obtidos pelo teclado. Em seguida, imprima o array, 
a soma de cada linha, a soma de cada coluna e a soma de todos os elementos. Crie métodos separados 
para preencher o array, imprimi-lo e realizar cada tipo de soma.

**Exercício 10:** Faça um programa que possui métodos para ler um número inteiro, ler um número inteiro positivo 
e ler um número decimal dentro de um intervalo informado. Cada método deve repetir a leitura enquanto o valor informado
for inválido. Depois, utilize estes métodos em pelo menos dois exercícios anteriores.

**Exercício 11:** Faça um programa que apresenta um menu com as opções de verificar se um número é par, calcular fatorial,
mostrar tabuada, calcular a média de um array e encerrar. Reutilize os métodos criados nos exercícios anteriores. 
O programa deve continuar sendo executado até que a opção de encerrar seja escolhida.

**Exercício 12:** Crie uma segunda classe chamada `Utilitarios` no mesmo pacote do programa. 
Mova para esta classe os métodos de cálculo criados nos exercícios anteriores, como verificar se um número é par,
calcular fatorial, encontrar maior valor e realizar conversões de temperatura. A classe `Main` deve conter o menu
e chamar os métodos da classe `Utilitarios`.

Ainda não utilize atributos, construtores ou objetos. O objetivo é organizar métodos relacionados em uma classe.
