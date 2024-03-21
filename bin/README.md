<h1 align="center"> 
Bootcamp Generation FullStack - Java</h1>

<h2 align="center">:page_facing_up: Descrição do projeto </h2>
<p> Repositório para entrega de atividades do Bootcamp de FullStack - Java realizado pela Generation</p>

<br>



<br>
<h2 align="center">:hourglass: Status do projeto </h2>
<h4> :white_check_mark: Desktop - Em andamento :white_check_mark: </h4>


<br>
<h2 align="center">:hammer: Funcionalidades do projeto </h2>
<h4> :white_check_mark:Classe ModelCategoria:white_check_mark: </h4>
  <ul>
    <li>id (Long) <br>
      Descrição: Identificador único para a categoria dentro da tabela. <br>
      @GeneratedValue: Indica que o atributo é incrementado automaticamente.</li>
    <li>nomeCategoria (String) <br>
      Descrição: Define o nome da categoria.<br>
      @NotBlank: O valor não pode ser nulo ou um espaço em branco. <br>
      @Size: O tamanho deve ter entre 5 e 50 caracteres.</li>
    <li>descricaoCategoria (String) <br>
      Descrição: Descreve a categoria. <br>
      @NotBlank: O valor não pode ser nulo ou um espaço em branco. <br>
      @Size: A descrição deve ter entre 10 e 255 caracteres.</li>
  </ul>
<h4> :white_check_mark:Classe ModelProduto:white_check_mark: </h4>
  <ul>
    <li>id (Long)<br>
      Descrição: Identificador único para o produto dentro da tabela. <br>
      @GeneratedValue: Indica que o atributo é incrementado automaticamente.</li>
    <li>nomeProduto (String) <br>
      Descrição: Armazena o nome do produto. <br>
      @NotBlank: O valor não pode ser nulo ou um espaço em branco. <br>
      @Size: O nome deve ter entre 5 e 45 caracteres.</li>
    <li>descricaoProduto (String) <br>
      Descrição: Armazena a descrição do produto. <br>
      @NotBlank: O valor não pode ser nulo ou um espaço em branco. <br>
      @Size: A descrição deve ter entre 5 e 45 caracteres.</li>
    <li>precoProduto (Float) <br>
      Descrição: Armazena o valor do produto. <br>
      @NotNull: O valor não pode ser nulo. <br>
      @Positive: O valor deve ser um número positivo. <br>
      @NumberFormat: O valor deve ser formatado como Float.<br>
      @Column: O valor deve ser decimal contendo no máximo 6 dígitos. (Ex. 1,234.56)</li>
    <li>quantidadeProduto (Integer) <br>
      Descrição: Armazena a quantidade de produtos disponíveis no estoque. <br>
      @NotNull: O valor não pode ser nulo <br>
      @PositiveOrZero: O valor não pode ser abaixo de zero</li>
  </ul>
<h4> :white_check_mark:Classe ModelUsuário:white_check_mark: </h4>
  <ul>
    <li>id (Long)<br>
      Descrição: Identificador único para o usuário dentro da tabela. <br>
      @GeneratedValue: Indica que o atributo é incrementado automaticamente.</li>
    <li>nomeUsuario (String) <br>
      Descrição: Armazena o nome real do usuário. <br>
      @NotBlank: O nome não pode ser nulo ou um espaço em branco. <br>
      @Size: O nome deve ter entre 5 e 255 caracteres.</li>
    <li>senhaUsuario (String) <br>
      Descrição: Armazena a senha do usuário. <br>
      @NotBlank: A senha não pode ser nula ou um espaço em branco. <br>
      @Size: A senha deve conter entre 8 e 32 caracteres.</li>
    <li>loginUsuario (String) <br>
      Descrição: Armazena o login/email utilizado no caadstro do usuário. <br>
      @NotBlank: O login ou email não pode ser nulo ou um espaço em branco. <br>
      @Size: O login deve ter entre 5 e 255 caracteres.</li>
    <li>fotoUsuario (String) <br>
      Descrição: Link para a foto do usuário. <br>
      @NotNull: O valor não pode ser nulo. <br>
      @Size: O link para a foto deve ter no máximo 45 caracteres.</li>
    <li>tipoUsuario (String) <br>
      Descrição: Define o tipo do usuário, se vendedor ou comprador. <br>
      @NotNull: O tipo de usuário não pode ser nulo. <br>
      @Size: O atributo deve ter no máximo 45 caracteres.</li>
    <li>produtosUsuario (Long) <br>
      Descrição: Armazena a quantidade de produtos postados pelo usuário se o mesmo for um vendedor. <br>
      @NumberFormat: O valor deve ser um número inteiro. <br>
      @PositiveOrZero: O valor não pode ser menor que 0.</li>
  </ul>

<br>
<h2 align="center"> :dart: Objetivo de aprendizado/ O que aprendi </h2>
<p>Com esse projeto utilizamos: </p>

- ``SQL``
- ``Java``
- ``Bootstrap``
-  ``HTML/CSS``




<br>
<br>




<br>
<h2 align="center"> :file_folder: Acesso ao projeto </h2>
<p> Você pode acessar o projeto final clicando aqui: </p>
<br>
<h2 align="center"> :computer: Tecnologias utilizadas </h2>

- ``Java``
- ``SQL``
- ``Bootstrap``
- ``HTML/CSS``



<br>
<h2 align="center"> :heavy_check_mark: Pessoas desenvolvedoras do projeto </h2>

| [<img loading="lazy" src="https://avatars.githubusercontent.com/u/147877236?v=4" width=115><br><sub>Ana Vitória Saddi Boen</sub>](https://github.com/anavsaddiboen) |  [<img loading="lazy" src="https://avatars.githubusercontent.com/u/114553041?v=4" width=115><br><sub>Brayan Roberto</sub>](https://github.com/Brayan-RDev) |  [<img loading="lazy" src="https://avatars.githubusercontent.com/u/157237344?v=4" width=115><br><sub>Gustavo Barbosa</sub>](https://github.com/Guxtta5)  |
| :---: | :---: | :---: |
| [<img loading="lazy" src="https://avatars.githubusercontent.com/u/87478340?v=4" width=115><br><sub>João Sabino</sub>](https://github.com/Joao-VPS) |  [<img loading="lazy" src="https://avatars.githubusercontent.com/u/128410036?v=4" width=115><br><sub>José Leandro</sub>](https://github.com/Axlvox) | [<img loading="lazy" src="https://avatars.githubusercontent.com/u/74688759?v=4" width=115><br><sub>Karolina Meira</sub>](https://github.com/KNMeira) |  
