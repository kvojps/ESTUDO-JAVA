# 1) Estudo Java:man_student:

* Diferente de outras linguagens de programação, que são compiladas para código nativo, o Java é compilado para um bytecode que é interpretado por uma máquina virtual.

![](https://instagram.frec25-1.fna.fbcdn.net/v/t51.2885-15/e35/108224925_867159487143498_9140291499432459867_n.jpg?tp=1&_nc_ht=instagram.frec25-1.fna.fbcdn.net&_nc_cat=106&_nc_ohc=cUChK7fkgJ8AX_Qre8P&edm=AABBvjUAAAAA&ccb=7-4&oh=e42bcb650fc4eb720abc6b968aaa11d7&oe=60AB6875&_nc_sid=83d603)

## O que é o Bytecode ?

É o código originado da compilação de programas Java, ou seja, é o programa interpretado e executado pela máquina virtual Java, JVM.

## O que é a JVM ?

A JVM é uma máquina virtual que executa programas Java, executando os bytecodes em linguagem de máquina para cada sistema operacional. Com o Java, compilamos para a JVM , o bytecode será executado pela máquina virtual, e não diretamente pelo SO, assim, o software escrito em Java possui portabilidade para qualquer sistema operacional, porém, cada JVM deve ser construída para um sistema operacional específico.

## O que é o JRE ?

JRE é composto pela JVM, bibliotecas, APIs da linguagem e outros componentes para suporte da plataforma Java. Ele representa a parte responsável pela execução do software Java.

## O que é a JDK ?

JDK é um conjunto de utilitários que permitem criar software para a plataforma Java. É composto pelo compilador Java, bibliotecas, ferramentas e a JRE.

## O que é Java SE ?

Java Standard Edition, é a distribuição mínima da plataforma de desenvolvimento de aplicações Java.

## O que é Java EE ?

Java Enterprise Edition, é uma extensão da Java SE que possui suporte a desenvolvimento de sistemas corporativos. Além do mínimo da plataforma, o Java EE possui diversas especificações de partes da infraestrutura de aplicações, como acesso a banco de dados, mensageria, serviços web, parser de arquivos e outros.

# 2) Tipos Java:coffee:

## :arrow_right: Tipos primitivos

* byte, short, int, long, float, double, char, boolean.
* Não aceitam valores nulos e possuem valores por padrão.

### Capacidade de armazenamento dos inteiros: 

* **byte**: 8 bits, você pode colocar números de -128 até 127 em um byte, por exemplo.
* **char**: 16 bits.
* **short**: 16 bits.
* **int**: 32 bits.
* **long**: 64 bits.

### Capacidade de armazenamento dos flutuantes:

* **float**: 32 bits.
* **double**: 64 bits.

**OBS.:** Devemos salientar que o tipo booleano , armazenar apenas um valor, sendo ele True ou False.

## :arrow_right:Tipos não primitivos

### Wrappers

* São objetos que representam os primitivos, veja mais sobre Auto-boxing e unboxing.
* Caso você queira definir tipos primitivos como nulos, pode utilizar os wrappers.

### Outros

* String, Number, Object e quaisquer outros objetos.

## :arrow_right:Tipagem

* **Forte e estática**: Em tempo de compilação, os tipos já são verificados. Uma vez que o tipo for atribuído a uma variável, ele não pode ser alterado.

# 3) Modificadores de acesso :lock:

## :arrow_right:public

* Pode ser acessado de qualquer lugar por qualquer entidade que possa visualizar a classe a que ele pertence.

## :arrow_right:private

* Os métodos e atributos da classe definidos como privados não podem ser acessados ou usados por nenhuma outra classe. Esses atributos e métodos também não podem ser visualizados pelas classes herdadas.

## :arrow_right:protected

* Torna o membro acessível as classes do mesmo pacote ou através de herança, seus membros herdados não são acessíveis a outras classes fora do pacote em que foram declarados.

## :arrow_right:default 

* A classe e/ou seus membros são acessíveis somente por classes do mesmo pacote, na sua declaração não é definido nenhum tipo de modificador, sendo este identificado pelo compilador.

## :arrow_right:abstract

* Esse modificador não é aplicado nas variáveis, apenas em classes e métodos. Uma classe abstrata não pode ser instanciada. Se houver alguma declaração de um métodos como abstract(abstrato) a classe também deve ser marcada como abstract.

## :arrow_right:static

* É usado para a criação de uma variável que poderá ser acessada por todas as instâncias de objetos desta classe como uma varável comun, ou seja, a variável criada será a mesma em todas as instâncias e quando seu conteúdo é modificado em uma das instâncias, a modificação ocorre em todas as demais. E nas declarações de métodos ajudam no acesso direto à classe, portanto não é necessário instanciar um objeto para acessar o método.

## :arrow_right:final

* Quando é aplicado na classe, não permite estender, nos métodos impede que o mesmo seja sobescrito (overriding) na subclasse, e nos valores de variáveis não pode ser alterado depois que já tenha sido atribuído um valor.

# 4) Interfaces :computer:

[Código relacionado ao assunto](https://github.com/kvojps/ESTUDO-JAVA/tree/main/CaracteristicasDaLinguagem/Interfaces)

* Métodos **abstratos**
  - Devem ser implementados por todos.
  - Novos métodos quebram as implementações.
* Métodos **default**
  * São herdados a todos que o implementam.
  * Novos métodos não quebram as implementações.

# 5) Enums :computer:

[Código relacionado ao assunto](https://github.com/kvojps/ESTUDO-JAVA/tree/main/CaracteristicasDaLinguagem/Enums)

* Basicamente são dicionários de dados imutáveis.
* Não é permitido criar novas instâncias.
* O construtor é sempre declarado como private.
* Por convenção, por serem objetos constantes e imutáveis(static, final), os nomes são em maiúsculo.

# 6) Métodos de Strings :nerd_face:

* Alguns dos exemplos abaixo foram descritos no pacote [Strings](https://github.com/kvojps/ESTUDO-JAVA/tree/main/CaracteristicasDaLinguagem/Strings) presente neste repositório.

| Método                | Descrição                                                    | tipo retornado |
| --------------------- | ------------------------------------------------------------ | -------------- |
| charAt()              | Retorna o caractere no índice especificado(posição).         | char           |
| compareTo()           | Compara duas strings lexicograficamente.                     | int            |
| compareToIgnoreCase() | Compara duas strings lexicograficamente, ignorando  as case differences. | int            |
| concat()              | Acrescenta uma string ao final de outra string.              | String         |
| contains()            | Verifica se uma string contém uma sequência de  caracteres.  | boolean        |
| equals()              | Compara duas strings, retorna verdadeiro se as  strings são iguais e falso se não. | boolean        |
| equalsIgnoreCase()    | Compara duas strings, ignorando as case considerations.      | boolean        |
| format()              | Retorna uma string formatada usando o local escolhido, formato da string e argumentos. | String         |
| getBytes()            | Codifica esta string em uma sequência de bytes usando o conjunto de caracteres nomeado, armazenando o resultado em um novo array. | byte[]         |
| hashCode()            | Retorna o hash code de uma String.                           |                |
| indexOf()             | Retorna a posição da primeira ocorrência encontrada de um caractere específicp da string. | int            |
| isEmpty()             | Verifica se a string está vazia.                             | boolean        |
| length()              | Retorna o tamanho da string declarada.                       | int            |
| replace()             | Procura na string por um valor específico, e retorna  uma nova string onde o valor específico foi alterado. | String         |
| split()               | Divide uma string em uma série de substrings.                | String[]       |
| toLowerCase()         | Converte todas as letras da string em minúsculas.            | String         |
| toUpperCase()         | Converte todas as letras da string em maiúsculas.            | String         |
| trim()                | Remove o espaço em branco em ambas extremidades de uma string. | String         |
| valueOf()             | Retorna a representação do valor especificado                | String         |

* [Ver todos os métodos de Strings disponíveis](https://www.w3schools.com/java/java_ref_string.asp)

# 7) :eye: no código

## :file_folder: CaracteristicasDaLinguagem : 

* Como vocês podem ver no arquivo [EstruturaClasse](https://github.com/kvojps/ESTUDO-JAVA/blob/main/CaracteristicasDaLinguagem/Classes/EstruturaClasse.java), como o próprio nome já diz, mostro a vocês a estrutura de uma programa em Java, nesse caso, apenas mais um ou o primeiro "hello world " no seu console. 

* Na pasta [Usuario](https://github.com/kvojps/ESTUDO-JAVA/tree/main/CaracteristicasDaLinguagem/Classes/Usuario), percebam que abordo conceitos iniciais da linguagem definindo um construtor para minha classe SuperUsuario, que vai ser utilizado para criação do objeto na classe ProgramaDoSuperUsuario e a posterior execução dos métodos definidos(getLogin(), getSenha()) em SuperUsuario.