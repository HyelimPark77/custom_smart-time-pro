.class public final Lcom/sma/smartv3/work/Upload$upload$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/work/Upload;->XIi00iiXO(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/android/mltcode/paycertificationapi/p96;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDataWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataWorker.kt\ncom/sma/smartv3/work/Upload$upload$1\n*L\n1#1,965:1\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDataWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataWorker.kt\ncom/sma/smartv3/work/Upload$upload$1\n*L\n1#1,965:1\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/android/mltcode/paycertificationapi/p96;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/mltcode/paycertificationapi/p96<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic XIi00iiXO:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/android/mltcode/paycertificationapi/p96;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/mltcode/paycertificationapi/p96<",
            "TT;>;",
            "Ljava/util/List<",
            "+TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/work/Upload$upload$1;->OXO1:Lcom/android/mltcode/paycertificationapi/p96;

    iput-object p2, p0, Lcom/sma/smartv3/work/Upload$upload$1;->XIi00iiXO:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleError(Ljava/lang/String;)V
    .locals 2

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "generateFile "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/work/Upload$upload$1;->XIi00iiXO:Ljava/util/List;

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public handleResponse(Ljava/lang/Object;)V
    .locals 1

    iget-object p1, p0, Lcom/sma/smartv3/work/Upload$upload$1;->OXO1:Lcom/android/mltcode/paycertificationapi/p96;

    iget-object v0, p0, Lcom/sma/smartv3/work/Upload$upload$1;->XIi00iiXO:Ljava/util/List;

    check-cast v0, Ljava/util/ArrayList;

    invoke-interface {p1, v0}, Lcom/android/mltcode/paycertificationapi/p96;->OXO1(Ljava/util/ArrayList;)V

    iget-object p1, p0, Lcom/sma/smartv3/work/Upload$upload$1;->XIi00iiXO:Ljava/util/List;

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    iget-object p1, p0, Lcom/sma/smartv3/work/Upload$upload$1;->XIi00iiXO:Ljava/util/List;

    check-cast p1, Ljava/util/ArrayList;

    iget-object v0, p0, Lcom/sma/smartv3/work/Upload$upload$1;->OXO1:Lcom/android/mltcode/paycertificationapi/p96;

    invoke-interface {v0}, Lcom/android/mltcode/paycertificationapi/p96;->getList()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-void
.end method
