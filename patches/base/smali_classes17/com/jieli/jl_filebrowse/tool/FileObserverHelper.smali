.class public Lcom/jieli/jl_filebrowse/tool/FileObserverHelper;
.super Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_filebrowse/interfaces/FileObserver;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager<",
        "Lcom/jieli/jl_filebrowse/interfaces/FileObserver;",
        ">;",
        "Lcom/jieli/jl_filebrowse/interfaces/FileObserver;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;-><init>(Landroid/os/Handler;)V

    return-void
.end method

.method public static synthetic a(ILcom/jieli/jl_filebrowse/interfaces/FileObserver;)V
    .locals 0

    .line 2
    invoke-interface {p1, p0}, Lcom/jieli/jl_filebrowse/interfaces/FileObserver;->onFileReadFailed(I)V

    return-void
.end method

.method public static synthetic a(Ljava/util/List;Lcom/jieli/jl_filebrowse/interfaces/FileObserver;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Lcom/jieli/jl_filebrowse/interfaces/FileObserver;->onFileReceiver(Ljava/util/List;)V

    return-void
.end method

.method public static synthetic a(ZLcom/jieli/jl_filebrowse/interfaces/FileObserver;)V
    .locals 0

    .line 3
    invoke-interface {p1, p0}, Lcom/jieli/jl_filebrowse/interfaces/FileObserver;->OnFlayCallback(Z)V

    return-void
.end method

.method public static synthetic b(Ljava/util/List;Lcom/jieli/jl_filebrowse/interfaces/FileObserver;)V
    .locals 0

    .line 2
    invoke-interface {p1, p0}, Lcom/jieli/jl_filebrowse/interfaces/FileObserver;->onSdCardStatusChange(Ljava/util/List;)V

    return-void
.end method

.method public static synthetic b(ZLcom/jieli/jl_filebrowse/interfaces/FileObserver;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Lcom/jieli/jl_filebrowse/interfaces/FileObserver;->onFileReadStop(Z)V

    return-void
.end method


# virtual methods
.method public OnFlayCallback(Z)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I0X0XO00;

    invoke-direct {v0, p1}, Lcom/android/mltcode/paycertificationapi/I0X0XO00;-><init>(Z)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method

.method public onFileReadFailed(I)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/I1i1O1OXI;

    invoke-direct {v0, p1}, Lcom/android/mltcode/paycertificationapi/I1i1O1OXI;-><init>(I)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method

.method public onFileReadStart()V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IiOiXOOi1;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/IiOiXOOi1;-><init>()V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method

.method public onFileReadStop(Z)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OIIiXI;

    invoke-direct {v0, p1}, Lcom/android/mltcode/paycertificationapi/OIIiXI;-><init>(Z)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method

.method public onFileReceiver(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/jieli/jl_filebrowse/bean/FileStruct;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OX11100iI;

    invoke-direct {v0, p1}, Lcom/android/mltcode/paycertificationapi/OX11100iI;-><init>(Ljava/util/List;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method

.method public onSdCardStatusChange(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/jieli/jl_filebrowse/bean/SDCardBean;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XOi0i1;

    invoke-direct {v0, p1}, Lcom/android/mltcode/paycertificationapi/XOi0i1;-><init>(Ljava/util/List;)V

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->callbackEvent(Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager$CallbackImpl;)V

    return-void
.end method
