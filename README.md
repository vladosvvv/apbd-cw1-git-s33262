# Git exercise

Repozytorium zawiera prostą aplikację konsolową w Javie, przygotowaną do ćwiczeń z Git.

## Dlaczego ten merge nie był fast-forward

Ten merge nie był fast-forward, ponieważ po utworzeniu gałęzi `feature-max`
został wykonany dodatkowy commit na gałęzi `main`.
Obie gałęzie miały więc różną historię zmian, dlatego Git utworzył merge commit.

## Informacja o rebase

Ta gałąź zostanie zaktualizowana przy użyciu rebase.

## Merge a rebase

Merge zachowuje historię rozgałęzień i tworzy osobny merge commit.
Rebase przepisuje commity na szczyt aktualnej gałęzi, dzięki czemu historia jest bardziej liniowa i czytelna.

## Odpowiedzi

### 1. Kiedy Git wykona fast-forward, a kiedy powstaje merge commit?

Fast-forward powstaje wtedy, gdy gałąź docelowa nie ma nowych commitów
od momentu utworzenia drugiej gałęzi i wskaźnik można po prostu przesunąć do przodu.
Merge commit powstaje wtedy, gdy obie gałęzie mają już własne, różne commity
i Git musi połączyć ich historię.

### 2. Czym w praktyce różni się merge od rebase?

Merge łączy dwie historie zmian i zachowuje informację o rozgałęzieniu.
Rebase przepisuje commity jednej gałęzi tak, jakby powstały później,
na aktualnej wersji drugiej gałęzi.
W praktyce merge lepiej pokazuje prawdziwy przebieg pracy, a rebase daje bardziej liniową historię.

### 3. W jaki sposób został rozwiązany konflikt w tym repozytorium?

Konflikt został rozwiązany ręcznie po pojawieniu się zmian w tym samym fragmencie kodu
na gałęzi `main` i `feature-conflict`.
Zamiast usuwać konflikt losowo, została wybrana i połączona poprawna wersja komunikatu,
tak aby program nadal działał poprawnie po merge'u.