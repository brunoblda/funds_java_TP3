# Infnet - TP3 - Fundamentos de Desenvolvimento Java
Teste de performance 3 da matéria de fundamentos de desenvolvimento Java

No Teste de Performance 3, você vai colocar em prática as seguintes habilidades desenvolvidas durante as etapas 5 e 6:

* Escrever o tratamento de exceções com try/catch/finally
* Escrever o lançamento de exceções com throws/throw
* Compreender e utilizar a hierarquia de exceções do Java
* Utilizar os construtores com parâmetros da classe String
* Utilizar os métodos da classe String
* Compreender as principais diferenças entre as classes String e StringBuilder
* Utilizar os métodos da classe StringBuilder

Você deve incrementar o programa de controle acadêmico para uma instituição de ensino que você construiu até aqui. Agora, você vai implementar o tratamento de erros e manipular strings em Java.

Para que o programa seja construído, você deverá instalar e configurar no seu computador o Java Development Kit, além do NetBeans, que contém os recursos necessários para compilar e executar o seu programa Java.

A estrutura do programa deve ser mantida. Percorra o código do seu programa, com o foco em possíveis erros que ele pode lançar. Por exemplo, suponha que uma opção acima da permitida no menu seja digitada, ou que o vetor exceda o limite, ou que uma string seja informada quando o valor solicitado é um inteiro.

Verifique e trate esses casos usando try, catch e finally. O finally é opcional, mas você deve utilizar pelo menos uma vez em seu programa. Escolha duas exceções não verificadas e trate em seu código. Além disso, crie sua própria classe de exceção e trate dentro do seu programa usando throws e throw.

Neste teste, você também deve tratar os nomes do professores e alunos que são informados no programa. Crie nos objetos atributos referentes a nome, nome do meio e último nome. Instancie objetos da classe String variando a utilização de seus construtores.

Você deve receber do usuário os nomes completos, mas separá-los para armazenar nas variáveis correspondentes. Você deve fazê-lo de duas formas no programa: a primeira utilizando os métodos substring e indexOf, e a segunda utilizando split. Implemente as duas formas nos métodos sets das classes e realize testes elas.

Para retornar as informações, implemente o uso da classe StringBuilder e seu método append para concatenar o nome completo e informar ao usuário quando o método consultarSituacao for chamado.