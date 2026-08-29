# software-training-practice — Team 11785

Your sandbox for the lessons and early tasks in
[frc-2027-software-training](https://github.com/Team-11785/frc-2027-software-training).

New here? Start with **START-HERE.md** in that repo, then
[`learn/00-install.md`](https://github.com/Team-11785/frc-2027-software-training/blob/main/learn/00-install.md).

---

## Rules

- Work **only inside your own folder**: `practice/<your-name>/` (lowercase, e.g.
  `practice/liran/`). Don't touch anyone else's.
- **One branch per lesson or task.** Name it `<thing>-<name>`, e.g.
  `learn03-liran`, `p01-liran`.
- **One Pull Request per branch.** Get a review before merging.
- Never commit `*.class`, `bin/`, or IDE folders (`.gitignore` handles these).
- Small commits with clear messages. See
  [coding-standards.md § 13](https://github.com/Team-11785/frc-2027-software-training/blob/main/docs/coding-standards.md).

## Folder layout

```
practice/
  <your-name>/
    learn/
      00/  01/  02/ … 09/     <- lesson exercises, one folder per lesson
    p01/                      <- task P01
    se01/                     <- task SE01
```

See [`practice/_example/`](practice/_example/) for the shape.

## The workflow (also taught in task G01)

```bash
git switch main && git pull
git switch -c learn01-<your-name>
# ... write code in practice/<your-name>/learn/01/ ...
git add practice/<your-name>
git commit -m "Do lesson 01 exercises"
git push -u origin learn01-<your-name>
# open a Pull Request on GitHub, get a review, merge, delete the branch
```

## Running your code

Plain Java — no build tool needed:

- VS Code: open a `.java` file with a `main`, click **Run**.
- Terminal, from the file's folder: `java Whatever.java`

(A `build.gradle` gets added later, once we reach JUnit tests.)
