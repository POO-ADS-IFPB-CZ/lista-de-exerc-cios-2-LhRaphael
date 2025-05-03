# Resolução das questões 1 e 2
## Questão 1
Uma boa prática configura-se na ideia de organizar a arquitetura do projeto de forma que ele se torne fácil de ser módificado.
Diante desta ideia, o uso de getters e setters permite uma maior segurança no tratamento dos dados se comparado a mera exposição pública
desses dados. Um exemplo de uso conceitual seria usar um setter para delimitar os valores de um atributo: o valor que o atributo deve receber 
não pode ser menor que 0 e não pode ser maior que 10.

## Questão 2
### A)
Para a representação de um livro em um sistema, algumas informações relevantes são: Titulo, Autor, Editora, Data de publicação, Gênero, Referências (caso possua), Súmario, Código do livro (usado internamente no sistema), Número de páginas, Conteúdo do livro (Podendo ser dividido corretamente entre as páginas), Sinopse e Volume (caso seja uma sequência)

### B)
Uma classe livro seria uma abstração pois não se trataria verdadeiramente de um livro, mas um molde para criação de objetos com características informacionais semelhantes a de um livro real.

### C)

**getAutor()** -> Consultar o nome do autor do livro

---

**getEditora()** -> Consultar o nome da Editora do livro

---

**getConteudoPagina(int numPag)** -> Consultar o conteúdo presente em uma página específica

