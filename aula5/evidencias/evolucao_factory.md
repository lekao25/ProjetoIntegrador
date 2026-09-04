# Evolução do padrão Factory - Aula 5

1. Simple Factory (um único método com if/else) — funcionava, mas violava OCP.
2. Refatorado para Factory Method: cada perfil tem sua própria fábrica.
3. Adicionado perfil Coordenador criando apenas 2 classes novas,
   sem tocar em nenhuma classe existente — comprova o Open/Closed Principle.
