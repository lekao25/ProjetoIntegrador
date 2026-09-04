# Diagrama de Classes — Domínio SIGA

```mermaid
classDiagram
    class Aluno {
        -String nome
        -double mensalidadeBase
        -Desconto desconto
        +calcularMensalidade() double
    }
    class Desconto {
        <<interface>>
        +aplicar(valor: double) double
    }
    class DescontoBolsista
    class DescontoRegular

    Aluno --> Desconto
    Desconto <|.. DescontoBolsista
    Desconto <|.. DescontoRegular
