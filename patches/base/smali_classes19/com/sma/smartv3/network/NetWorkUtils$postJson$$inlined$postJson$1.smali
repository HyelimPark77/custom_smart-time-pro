.class public final Lcom/sma/smartv3/network/NetWorkUtils$postJson$$inlined$postJson$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/androidnetworking/interfaces/ParsedRequestListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/network/NetWorkUtils;->postJson(Ljava/lang/String;Ljava/lang/Object;Lcom/android/mltcode/paycertificationapi/O1XIiIO;Landroid/app/Activity;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/androidnetworking/interfaces/ParsedRequestListener<",
        "Lcom/sma/androidnetworklib/model/Response<",
        "TT;>;>;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nNetWork.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork$postJson$1\n*L\n1#1,511:1\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nNetWork.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork$postJson$1\n*L\n1#1,511:1\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $callback:Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# direct methods
.method public constructor <init>(Lcom/android/mltcode/paycertificationapi/O1XIiIO;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/network/NetWorkUtils$postJson$$inlined$postJson$1;->$callback:Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Lcom/androidnetworking/error/ANError;)V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/network/NetWorkUtils$postJson$$inlined$postJson$1;->$callback:Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/android/mltcode/paycertificationapi/O1XIiIO;->handleError(Ljava/lang/String;)V

    return-void
.end method

.method public onResponse(Lcom/sma/androidnetworklib/model/Response;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/androidnetworklib/model/Response<",
            "TT;>;)V"
        }
    .end annotation

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/sma/smartv3/network/NetWorkUtils$postJson$$inlined$postJson$1;->$callback:Lcom/android/mltcode/paycertificationapi/O1XIiIO;

    invoke-interface {v0, p1}, Lcom/android/mltcode/paycertificationapi/O1XIiIO;->handleResponse(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic onResponse(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/sma/androidnetworklib/model/Response;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/network/NetWorkUtils$postJson$$inlined$postJson$1;->onResponse(Lcom/sma/androidnetworklib/model/Response;)V

    return-void
.end method
