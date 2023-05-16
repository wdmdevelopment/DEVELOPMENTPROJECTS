import { PayPalButton } from "react-paypal-button-v2";

export default function Paypal() {

    const onSuccess = (details, data) => {
        console.log(details);
        console.log(data);
      };
    
    return(
<div>

{/* <PayPalButton 
amount="10.00"
currency="USD"
onSuccess={onSuccess}
options={{
  clientId: "AS9C9FIUBHw_vZIZa39pXv4rsX7LjkB3eUZg3ankXLfjwP5VlUIYhh62xfigSScNdr2CK67eP6EzpEHi",
}} /> */}


</div>
    );
}