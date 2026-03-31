from urllib.request import urlopen

def main() -> None:
    try:
        url = "https://projecteuler.net/project/resources/p022_names.txt"

        with urlopen(url) as response:
            line = response.read().decode("utf-8").strip()

        names = line.replace('"', "").split(",")
        names.sort()
        sum_total = 0
        for name in names:
            for i in name:
                sum_total += (ord(i) - 64) * (names.index(name) + 1)

        print(sum_total)
        
    except Exception as exc:
        print(f"Error: {exc}")


if __name__ == "__main__":
    main()
  
#Output:871198282
