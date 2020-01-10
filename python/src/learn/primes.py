
def output_primes(n, x):
    for i in range(n, x):
        if (float(i) / float(2)).is_integer():
            print(i);

if __name__ == "__main__":
    output_primes(2, 30)