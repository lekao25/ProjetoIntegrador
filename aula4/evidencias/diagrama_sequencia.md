# Diagrama de Sequência — Cálculo da Mensalidade

​```mermaid
sequenceDiagram
    participant Main as Principal
    participant A as Aluno
    participant D as Desconto

    Main->>A: calcularMensalidade()
    A->>D: aplicar(mensalidadeBase)
    D-->>A: valorComDesconto
    A-->>Main: valorComDesconto
​```
