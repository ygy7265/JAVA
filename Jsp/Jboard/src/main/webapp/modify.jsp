<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="./_header.jsp" %>
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
<%@ include file="./_footer.jsp" %>