.class Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper$CallbackRunnable;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CallbackRunnable"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Runnable;"
    }
.end annotation


# instance fields
.field private final a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final b:Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper$ICallbackHandler;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper$ICallbackHandler<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper$ICallbackHandler;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "TT;>;",
            "Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper$ICallbackHandler<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper$CallbackRunnable;->a:Ljava/util/ArrayList;

    iput-object p2, p0, Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper$CallbackRunnable;->b:Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper$ICallbackHandler;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper$CallbackRunnable;->a:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper$CallbackRunnable;->b:Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper$ICallbackHandler;

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper$CallbackRunnable;->a:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v2, v2, 0x1

    iget-object v4, p0, Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper$CallbackRunnable;->b:Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper$ICallbackHandler;

    invoke-interface {v4, v3}, Lcom/jieli/jl_bt_ota/tool/callback/BaseCallbackHelper$ICallbackHandler;->onHandle(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method
