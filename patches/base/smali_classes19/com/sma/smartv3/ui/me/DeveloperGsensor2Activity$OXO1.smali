.class public final Lcom/sma/smartv3/ui/me/DeveloperGsensor2Activity$OXO1;
.super Landroid/os/CountDownTimer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/me/DeveloperGsensor2Activity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/me/DeveloperGsensor2Activity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/me/DeveloperGsensor2Activity;J)V
    .locals 2

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperGsensor2Activity$OXO1;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperGsensor2Activity;

    const-wide/16 v0, 0x3e8

    invoke-direct {p0, p2, p3, v0, v1}, Landroid/os/CountDownTimer;-><init>(JJ)V

    return-void
.end method


# virtual methods
.method public onFinish()V
    .locals 3

    const-string v0, "onFinish"

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperGsensor2Activity$OXO1;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperGsensor2Activity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/me/DeveloperGsensor2Activity;->access$getTvInfo(Lcom/sma/smartv3/ui/me/DeveloperGsensor2Activity;)Landroid/widget/TextView;

    move-result-object v1

    const-string v2, "access$getTvInfo(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/ui/me/DeveloperGsensor2Activity;->toggle(Landroid/view/View;)V

    return-void
.end method

.method public onTick(J)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onTick -> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperGsensor2Activity$OXO1;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperGsensor2Activity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/me/DeveloperGsensor2Activity;->access$getTvTime(Lcom/sma/smartv3/ui/me/DeveloperGsensor2Activity;)Landroid/widget/TextView;

    move-result-object v0

    long-to-int p1, p1

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->Ii1iii0(I)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u5269\u4f59\u65f6\u95f4:"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
