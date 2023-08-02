<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Jboard::modify</title>
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
            <section id="board" class="modify">
                <h3>Modify</h3>
                <article>
                    <form action="#">
                        <table>
                            <tr>
                                <td>Title</td>
                                <td><input type="text" name="title" placeholder="Title ADD"></td>
                            </tr>
                            <tr>
                                <td>Content</td>
                                <td>
                                    <textarea name="content"></textarea>
                                </td>
                            </tr>
                            <tr>
                                <td>Attachment</td>
                                <td><input type="file" name="file"></td>
                            </tr>
                        </table>
                        <div>
                            <a href="./list.html" class="btnCancel">Cancel</a>
                            <input type="submit" class="btnWrite" value="WriteSucess">
                        </div>
                    </form>
                </article>
            </section>
        </main>
        <footer>
            <p>ⓒcopyright YoonGyeongYeop.com</p>
        </footer>
    </div>
</body>
</html>