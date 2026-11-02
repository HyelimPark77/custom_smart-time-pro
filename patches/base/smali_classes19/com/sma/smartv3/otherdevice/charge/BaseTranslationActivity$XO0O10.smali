.class public final Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$XO0O10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic IO:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$XO0O10;->IO:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$XO0O10;->IO:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getElapsedTime()J

    move-result-wide v1

    iget-object v3, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$XO0O10;->IO:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;

    invoke-virtual {v3}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getUpdateInterval()J

    move-result-wide v3

    add-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->setElapsedTime(J)V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$XO0O10;->IO:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->updateTimerText()V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$XO0O10;->IO:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMHandler()Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$XO0O10;->IO:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;

    invoke-virtual {v1}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getUpdateInterval()J

    move-result-wide v1

    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
