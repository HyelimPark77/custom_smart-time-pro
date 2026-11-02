.class public Lcom/jieli/jl_filebrowse/tool/LrcReadObserverHelper;
.super Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_filebrowse/interfaces/lrc/LrcReadObserver;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager<",
        "Lcom/jieli/jl_filebrowse/interfaces/lrc/LrcReadObserver;",
        ">;",
        "Lcom/jieli/jl_filebrowse/interfaces/lrc/LrcReadObserver;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;-><init>(Landroid/os/Handler;)V

    return-void
.end method

.method public static synthetic a(ILcom/jieli/jl_filebrowse/interfaces/lrc/LrcReadObserver;)V
    .locals 0

    .line 2
    invoke-interface {p1, p0}, Lcom/jieli/jl_filebrowse/interfaces/lrc/LrcReadObserver;->onLrcReadFailed(I)V

    return-void
.end method

.method public static synthetic a(Ljava/lang/String;Lcom/jieli/jl_filebrowse/interfaces/lrc/LrcReadObserver;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Lcom/jieli/jl_filebrowse/interfaces/lrc/LrcReadObserver;->onLrcReadStop(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public onLrcReadFailed(I)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/d00;

    invoke-direct {v0, p1}, Lcom/android/mltcode/paycertificationapi/d00;-><init>(I)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method

.method public onLrcReadStart()V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/b00;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/b00;-><init>()V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method

.method public onLrcReadStop(Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/c00;

    invoke-direct {v0, p1}, Lcom/android/mltcode/paycertificationapi/c00;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method
