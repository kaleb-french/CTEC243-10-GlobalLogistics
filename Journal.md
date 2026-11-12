# Journal
Write your Journal questions and notes here.

Phase 1-
An adjacency Matrix is great for small fixed hubs due to their very fast lookup up times the trade off against something like a adjacency list is the memory usage. The list is much more memory efficent which allows it to scale larger without memory issues, while the matrix is better for fast lookups in a small group.

Phase 2-
The Queue being a FIFO structure allows cities to be added level by level, starting with the first city it addes each adjoining city as there are encountered ensuring through the BFS approach you are exploring the closest connection first. 

Phase 3-
The main difference as far as data structures used is BFS uses a Queue, and DFS uses a stack, This allows BFS to vist all close by nodes first while DFS goes deep before backtracking to other closeby nodes.
