import { PayPalScriptProvider, PayPalButtons } from "@paypal/react-paypal-js";


export default function OfficialPaypal (){

    const paypalOptions = {
        "client-id": "AS9C9FIUBHw_vZIZa39pXv4rsX7LjkB3eUZg3ankXLfjwP5VlUIYhh62xfigSScNdr2CK67eP6EzpEHi",
        currency: "USD",
       
      };

      const createOrder = (data, actions) => {
        // Logic to create the order on the server
        return actions.order.create({
          purchase_units: [
            {
              amount: {
                value: "10.00",
              },
            },
          ],
        });
      };

      const onApprove = (data, actions) => {
        // Logic when payment is approved
        return actions.order.capture().then(function (details) {
            const amount = details.purchase_units[0].amount.value;
            console.log("Amount:", amount);
            console.log(data);
        });
      };

      const buttonStyles = {
        layout: "vertical", // horizontal | vertical
        color: "silver", // gold | blue | silver | black
        shape: "pill", // pill | rect
        label: "paypal", // paypal | checkout | pay | buynow | credit
        height: 50, // Specify the height in pixels
      };

return(
<div>
    <PayPalScriptProvider options={paypalOptions}>
      <PayPalButtons createOrder={createOrder} onApprove={onApprove} style={buttonStyles} />
    </PayPalScriptProvider>

</div>

)

}