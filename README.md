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