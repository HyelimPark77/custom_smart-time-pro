.class public final Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivityKt$watchFacesDownloadable$2$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivityKt$watchFacesDownloadable$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Throwable;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic I1:Lcom/android/mltcode/paycertificationapi/IO0i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/mltcode/paycertificationapi/IO0i<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic IO:Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivityKt$watchFacesDownloadable$2$XIi00iiXO;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivityKt$watchFacesDownloadable$2$XIi00iiXO;Lcom/android/mltcode/paycertificationapi/IO0i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivityKt$watchFacesDownloadable$2$XIi00iiXO;",
            "Lcom/android/mltcode/paycertificationapi/IO0i<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivityKt$watchFacesDownloadable$2$OXO1;->IO:Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivityKt$watchFacesDownloadable$2$XIi00iiXO;

    iput-object p2, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivityKt$watchFacesDownloadable$2$OXO1;->I1:Lcom/android/mltcode/paycertificationapi/IO0i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final OXO1(Ljava/lang/Throwable;)V
    .locals 1

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivityKt$watchFacesDownloadable$2$OXO1;->IO:Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivityKt$watchFacesDownloadable$2$XIi00iiXO;

    invoke-virtual {p1, v0}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivityKt$watchFacesDownloadable$2$OXO1;->I1:Lcom/android/mltcode/paycertificationapi/IO0i;

    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/dialpay/WatchFaceDialPayDetailActivityKt$watchFacesDownloadable$2$OXO1;->OXO1(Ljava/lang/Throwable;)V

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method
