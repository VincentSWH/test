function check_form(form1){
    if(form1.ship_name.value=="")  {
        alert("The ship name cannot be empty!");form1.ship_name.focus();return false;
    }
    if(form1.port.value=="")  {
        alert("The port cannot be empty!");form1.port.focus();return false;
    }
    if(form1.Tonnage.value=="")  {
        alert("The Tonnage cannot be empty!");form1.Tonnage.focus();return false;
    }
    if(form1.Length.value=="")  {
        alert("The Length cannot be empty!");form1.Length.focus();return false;
    }
    if(form1.Breadth.value=="")  {
        alert("The Breadth cannot be empty!");form1.Breadth.focus();return false;
    }
    if(form1.Depth.value=="")  {
        alert("The Depth cannot be empty!");form1.Depth.focus();return false;
    }
    if(form1.Signature.value=="")  {
        alert("The Signature cannot be empty!");form1.Signature.focus();return false;
    }
}