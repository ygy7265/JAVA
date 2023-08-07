<%@ include file="./_header.jsp" %>
   <main>
       <section id="board" class="view">
           <h3>Write</h3>    
                   <table>
                       <tr>
                           <td>Title</td>
                           <td><input type="text" name="title" placeholder="Title ADD"></td>
                       </tr>
                       <tr>
                           <td>Content</td>
                           <td>
                               <textarea name="content" readonly> Content Sample</textarea>
                           </td>
                       </tr>
                       <tr>
                           <td>Attachment</td>
                           <td><input type="file" name="file"></td>
                       </tr>
                   </table>
                   <div>
                       <a href="#" class="btnDelete">Delete</a>
                       <a href="./modify.html" class="btnModify">Update</a>
                       <a href="./list.html" class="btnList">list</a>                    
                   </div>
                   <section class="commentList">
                       <h3>Comments</h3>
                       <article class="comment">
                       <span>
                           <span>YoonGyeongYeop</span>
                           <span>23-08-01</span>
                       </span>
                       <textarea name="comment" readonly>Comments Sample</textarea>
                       <div>
                           <a href="#">Delete</a>
                           <a href="#">Update</a>
                       </div>
                       </article>
                       <p class="empty">
                           No Comments
                       </p>
                   </section>
                   <section class="commentForm">
                       <h3>ComentsWrite</h3>
                       <form action="#">
                           <textarea name="comment"></textarea>
                               <div>
                                   <a href="#" class="btnCancle">Cancel</a>
                                   <input type="submit" class="btnWrite" value="Write Success"/>
                               </div>
                           
                       </form>
                   </section>
       </section>
   </main>
<%@ include file="./_footer.jsp" %>