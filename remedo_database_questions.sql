1. select usr.user_id, usr.address, tr.total_invoice_amount, tr.invoice_amount_paid, tr.remedo_commission 
from users as usr join transactions as tr on usr.user_id = tr.user_id where user_id = u1;

2. select sum(remedo_commission) as RemedoCommission from transactions where user_id = u1;

3. select * from user_extra_info where whatsapp_disabled is true;

4. select * from user_extra_info as usr_ex right join users as usr on usr_ex.user_id != usr.user_id;

5. select * from users as usr join transactions as tr on usr.user_id = tr.user_id join user_extra_info as usr_ex on usr_ex.user_id != usr.user_id
 where tr.user_id = usr.user_id;