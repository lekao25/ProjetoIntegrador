# Diagnóstico SOLID - Aula 3

## Problema encontrado no código original
A classe `RelatorioAluno` calculava desconto, formatava valores e imprimia
relatório, tudo dentro do mesmo método — violando SRP e OCP (qualquer novo
tipo de desconto exigia alterar um `if/else` gigante).

## Solução aplicada
- Criada interface `Desconto` (abstração).
- Cada tipo de desconto em uma classe própria (`DescontoBolsista`, `DescontoRegular`).
- `Aluno` recebe o desconto por injeção (composição), sem conhecer a regra.
