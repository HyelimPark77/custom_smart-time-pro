.class public final Lcom/sma/smartv3/ui/me/DeveloperActivity$XIi00iiXO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/me/DeveloperActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic IO:Lcom/sma/smartv3/ui/me/DeveloperActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/me/DeveloperActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperActivity$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/me/DeveloperActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lcom/sma/smartv3/ui/me/DeveloperActivity$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/me/DeveloperActivity;

    invoke-static {v2}, Lcom/sma/smartv3/ui/me/DeveloperActivity;->access$getMLastReceiveTime$p(Lcom/sma/smartv3/ui/me/DeveloperActivity;)J

    move-result-wide v2

    sub-long/2addr v0, v2

    iget-object v2, p0, Lcom/sma/smartv3/ui/me/DeveloperActivity$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/me/DeveloperActivity;

    invoke-static {v2}, Lcom/sma/smartv3/ui/me/DeveloperActivity;->access$getMAX_TIME$p(Lcom/sma/smartv3/ui/me/DeveloperActivity;)J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperActivity$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/me/DeveloperActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/me/DeveloperActivity;->access$zipLog(Lcom/sma/smartv3/ui/me/DeveloperActivity;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperActivity$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/me/DeveloperActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/me/DeveloperActivity;->access$getMHandler$p(Lcom/sma/smartv3/ui/me/DeveloperActivity;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperActivity$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/me/DeveloperActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/me/DeveloperActivity;->access$getMAX_TIME$p(Lcom/sma/smartv3/ui/me/DeveloperActivity;)J

    move-result-wide v1

    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
