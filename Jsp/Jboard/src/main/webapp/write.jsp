<%@ include file="./_header.jsp" %>
   <main>
     <section id="board" class="write">
         <h3>Write</h3>
         <article>
             <form action="/Jboard/proc/Proc.jsp?write=<%= sessUser.getUid() %>&num=3" method="post">
                 <table>
                     <tr>
                         <td>Title</td>
                         <td><input type="text" name="title" required placeholder="Title ADD"></td>
                     </tr>
                     <tr>
                         <td>Content</td>
                         <td>
                             <textarea name="content" required></textarea>
                         </td>
                     </tr>
                     <tr>
                         <td>Attachment</td>
                         <td><input type="file" name="file"></td>
                     </tr>
                 </table>
                 <div>
                     <a href="./list.jsp" class="btnCancel">Cancel</a>
                     <input type="submit" class="btnWrite" value="WriteSucess">
                 </div>
             </form>
         </article>
       </section>
   </main>
<%@ include file="./_footer.jsp" %>