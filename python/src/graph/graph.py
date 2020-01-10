from collections import defaultdict

our_graph = defaultdict(list)


def run_graph():
    print('Creating Graph...')
    add_edges("London", "Barcelona")
    add_edges("Barcelona", "Madrid")
    add_edges("Madrid", "Ottawa")
    add_edges("Madrid", "Berlin")
    add_edges("London", "Ottawa")

    print('\nOur Graph:')
    print(our_graph)

    print('\nEdges:')
    print(list_edges())

    print('\nTesting Paths To Invalid Nodes:')
    print(find_all_paths("LDN", "Ottawa"))
    print(find_all_paths("London", "X"))

    print('\nTesting Paths To Valid Nodes:')
    print(find_all_paths("London", "Berlin"))
    print('---')
    print(find_shortest_path("London", "Berlin"))


def add_edges(a, b):
    our_graph[a].append(b)
    our_graph[b].append(a)


def list_edges():
    edges = []
    for node in our_graph:
        for next_node in our_graph[node]:
            edges.append((node, next_node))
    return edges


def find_all_paths(start, end, path=[]):
    # If there isn't a node with that name
    if our_graph[start] == [] or our_graph[end] == []:
        return 'Can\'t find nodes ' + start + " " + end
    else:
        # create a path
        path = path + [start]
        # If start node is the end
        if start == end:
            return [path]
        paths = []
        newpaths = []
        # For each node
        for node in our_graph[start]:
            # If node not already in saved path
            if node not in path:
                # Search the paths of that new node
                newpaths = find_all_paths(node, end, path)
                # Append new path to paths
                for newpath in newpaths:
                    paths.append(newpath)
        return paths


def find_shortest_path(start, end):
    paths = find_all_paths(start, end)
    shortest = None
    for path in paths:
        if shortest == None:
            shortest = path
        elif len(shortest) > len(path):
            shortest = path
    return shortest


if __name__ == '__main__':
    run_graph()
