CheckNotas
==========

Projeto para verificação de Notas continuamente.

Utilizado:
==========
Maven

Selenium Webdriver

jUnit

Configuração
==========

Necessário criar um arquivo no caminho windows "C://keys//dados.properties"

Adicionar ao path da máquina o executável do PhantonJS disponível em:


https://bitbucket.org/ariya/phantomjs/downloads/phantomjs-2.0.0-windows.zip


OBS: Não alterar o nome por que está definido assim no código.

No arquivo deve estar contido:
#Usuario e senha

Usuario=NumeroMatricula

Senha=SuaSenha

As notas estão sendo validadas com assertEquals do JUnit, então deve ser alterado para suas notas.

Execução
==========
Executar o projeto com o JDK.

Pode-se executar o projeto através do maven install, ou executando a classe TestCheckNotasPos.java pelo JUnit.


