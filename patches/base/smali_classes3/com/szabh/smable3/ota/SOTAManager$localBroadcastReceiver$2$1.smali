.class public final Lcom/szabh/smable3/ota/SOTAManager$localBroadcastReceiver$2$1;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/szabh/smable3/ota/SOTAManager;-><init>(Landroid/content/Context;Lcom/android/mltcode/paycertificationapi/zc1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/szabh/smable3/ota/SOTAManager;


# direct methods
.method public constructor <init>(Lcom/szabh/smable3/ota/SOTAManager;)V
    .locals 0

    iput-object p1, p0, Lcom/szabh/smable3/ota/SOTAManager$localBroadcastReceiver$2$1;->OXO1:Lcom/szabh/smable3/ota/SOTAManager;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const-string v2, "context"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "intent"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_8

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    const v4, -0x736983ec

    const/4 v5, 0x0

    if-eq v3, v4, :cond_6

    const v4, 0x34f7a38d

    if-eq v3, v4, :cond_2

    const v4, 0x69031540

    if-eq v3, v4, :cond_0

    goto/16 :goto_0

    :cond_0
    const-string v3, "com.sifli.siflidfu.BROADCAST_DFU_LOG"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto/16 :goto_0

    :cond_1
    const-string v2, "com.sifli.siflidfu.EXTRA_LOG_MESSAGE"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, v0, Lcom/szabh/smable3/ota/SOTAManager$localBroadcastReceiver$2$1;->OXO1:Lcom/szabh/smable3/ota/SOTAManager;

    invoke-static {v4}, Lcom/szabh/smable3/ota/SOTAManager;->O10IXXX0X(Lcom/szabh/smable3/ota/SOTAManager;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " BROADCAST_DFU_LOG : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void

    :cond_2
    const-string v3, "com.sifli.siflidfu.BROADCAST_DFU_STATE"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto/16 :goto_0

    :cond_3
    const-string v2, "com.sifli.siflidfu.EXTRA_DFU_STATE"

    invoke-virtual {v1, v2, v5}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2

    const-string v3, "com.sifli.siflidfu.EXTRA_DFU_STATE_RESULT"

    invoke-virtual {v1, v3, v5}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    sget-object v3, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, v0, Lcom/szabh/smable3/ota/SOTAManager$localBroadcastReceiver$2$1;->OXO1:Lcom/szabh/smable3/ota/SOTAManager;

    invoke-static {v5}, Lcom/szabh/smable3/ota/SOTAManager;->O10IXXX0X(Lcom/szabh/smable3/ota/SOTAManager;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " BROADCAST_DFU_STATE result : dfuState="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, "  dfuStateResult = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    const/16 v3, 0x64

    if-eq v2, v3, :cond_4

    goto :goto_0

    :cond_4
    if-nez v1, :cond_5

    iget-object v4, v0, Lcom/szabh/smable3/ota/SOTAManager$localBroadcastReceiver$2$1;->OXO1:Lcom/szabh/smable3/ota/SOTAManager;

    const/4 v9, 0x6

    const/4 v10, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    invoke-static/range {v4 .. v10}, Lcom/android/mltcode/paycertificationapi/iX0X;->I0iXXO(Lcom/android/mltcode/paycertificationapi/iX0X;ILjava/lang/String;DILjava/lang/Object;)V

    return-void

    :cond_5
    iget-object v11, v0, Lcom/szabh/smable3/ota/SOTAManager$localBroadcastReceiver$2$1;->OXO1:Lcom/szabh/smable3/ota/SOTAManager;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "dfuState="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", dfuStateResult="

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    const/16 v16, 0x4

    const/16 v17, 0x0

    const/4 v12, 0x7

    const-wide/16 v14, 0x0

    invoke-static/range {v11 .. v17}, Lcom/android/mltcode/paycertificationapi/iX0X;->I0iXXO(Lcom/android/mltcode/paycertificationapi/iX0X;ILjava/lang/String;DILjava/lang/Object;)V

    return-void

    :cond_6
    const-string v3, "com.sifli.siflidfu.EXTRA_BROADCAST_PROGRESS"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    goto :goto_0

    :cond_7
    const-string v2, "com.sifli.siflidfu.EXTRA_DFU_PROGRESS"

    invoke-virtual {v1, v2, v5}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2

    const-string v3, "com.sifli.siflidfu.EXTRA_DFU_PROGRESS_TYPE"

    invoke-virtual {v1, v3, v5}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    iget-object v6, v0, Lcom/szabh/smable3/ota/SOTAManager$localBroadcastReceiver$2$1;->OXO1:Lcom/szabh/smable3/ota/SOTAManager;

    int-to-double v1, v2

    const-wide/high16 v3, 0x4059000000000000L    # 100.0

    div-double v9, v1, v3

    const/4 v11, 0x2

    const/4 v12, 0x0

    const/4 v7, 0x5

    const/4 v8, 0x0

    invoke-static/range {v6 .. v12}, Lcom/android/mltcode/paycertificationapi/iX0X;->I0iXXO(Lcom/android/mltcode/paycertificationapi/iX0X;ILjava/lang/String;DILjava/lang/Object;)V

    :cond_8
    :goto_0
    return-void
.end method
