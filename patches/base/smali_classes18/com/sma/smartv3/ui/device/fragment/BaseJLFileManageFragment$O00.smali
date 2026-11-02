.class public final Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment$O00;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic IO:Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment$O00;->IO:Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment$O00;->IO:Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->getProgress1111()I

    move-result v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment$O00;->IO:Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v1, v0}, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->setProgress1111(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment$O00;->IO:Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->taskProgress()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment$O00;->IO:Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->getProgress1111()I

    move-result v0

    const/16 v1, 0x64

    if-gt v0, v1, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment$O00;->IO:Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;->access$getMHandler111$p(Lcom/sma/smartv3/ui/device/fragment/BaseJLFileManageFragment;)Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_0

    const-wide/16 v1, 0x28

    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method
