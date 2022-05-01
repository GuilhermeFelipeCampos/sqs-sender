Principais diferenças  
Tipo de entidade  
SQS : Fila (semelhante a JMS, MSMQ).  
SNS : Assinante do tópico (sistema Pub/Sub).

Consumo de mensagens    
SQS : Pull Mechanism — Os consumidores pesquisam mensagens do SQS.  
SNS : Push Mechanism — SNS envia mensagens para todos os consumidores.


Persistência     
SQS : As mensagens são persistidas por algum tempo se nenhum consumidor estiver disponível. O valor do período de retenção é de 1 minuto a 14 dias. O padrão é 4 dias.  

SNS: Sem persistência. Qualquer consumidor que esteja presente no momento da chegada da mensagem, receba a mensagem e a mensagem será excluída. Se nenhum consumidor estiver disponível, a mensagem será perdida.
No SQS a entrega da mensagem é garantida, mas no SNS não.


Tipo de consumidor      
SQS: Todos os consumidores devem ser idênticos e, portanto, processar as mensagens exatamente da mesma maneira.   
SNS: Todos os consumidores estão (supostamente) processando as mensagens de maneiras diferentes.