<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Jboard::list</title>
    <link rel="stylesheet" href="./css/style.css">
    <style>
    
    </style>
</head>
<body>
    <div id="container">
        <header>
            <h3>Board System v1.0</h3>
            <p>
                WellCome
                <a href="#" class="logout">Logout</a>
            </p>
        </header>
        <main>
            <section id="board" class="list">
                <h3>List</h3>
                <article>
                    <table>
                        <tr>
                            <th>Number</th>
                            <th>Title</th>
                            <th>Writer</th>
                            <th>Date</th>
                            <th>inquiry</th>
                        </tr>
                        <tr>
                            <td>1</td>
                            <td><a href="./view.html">TestTitle</a>&nbsp;[3]</td>
                            <td>YoonGyeongYeop</td>
                            <td>23-08-01</td>
                            <td>255</td>
                        </tr>
                    </table>
                </article>
                <div class="paging">
                    <a href="#" class="prev">Back</a>
                    <a href="#" class="num current">1</a>
                    <a href="#" class="num">2</a>
                    <a href="#" class="num">3</a>
                    <a href="#" class="next">Next</a>
                </div>

                <a href="#" class="btnWrite">Write</a>
            </section>
        </main>
        <footer>
            <p>ⓒcopyright YoonGyeongYeop.com</p>
        </footer>
    </div>
</body>
</html>