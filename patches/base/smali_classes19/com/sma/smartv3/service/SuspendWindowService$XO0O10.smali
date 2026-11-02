.class public final Lcom/sma/smartv3/service/SuspendWindowService$XO0O10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/service/SuspendWindowService;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic IO:Lcom/sma/smartv3/service/SuspendWindowService;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/service/SuspendWindowService;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService$XO0O10;->IO:Lcom/sma/smartv3/service/SuspendWindowService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService$XO0O10;->IO:Lcom/sma/smartv3/service/SuspendWindowService;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/service/SuspendWindowService;->showBg(Z)V

    return-void
.end method
