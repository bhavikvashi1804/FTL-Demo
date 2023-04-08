<div id="header">
  <h2>Students List</h2>
</div>
<div id="content">

<br/>
<table>
  <tr>
    <th>Name</th>
    <th>Age</th>
  </tr>
  <#list students as student>
  <tr>
    <td>${student.name}</td>
    <td>${student.age}</td>
  </tr>
</#list>
</table>
        </div>