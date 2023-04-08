<div id="header">
  <h2>Cars List</h2>
</div>
<div id="content">

  <br/>
  <table>
    <tr>
      <th>Car Name</th>
      <th>Car Model</th>
    </tr>
    <#list model["carList"] as car>
      <tr>
        <td>${car.name}</td>
        <td>${car.model}</td>
      </tr>
    </#list>
  </table>
</div>
