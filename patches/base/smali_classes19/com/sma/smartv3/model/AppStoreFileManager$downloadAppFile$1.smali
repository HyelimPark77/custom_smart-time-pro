.class public final Lcom/sma/smartv3/model/AppStoreFileManager$downloadAppFile$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/androidnetworklib/method/HttpProgressCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/model/AppStoreFileManager;->downloadAppFile(Ljava/lang/String;Ljava/lang/String;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/sma/androidnetworklib/method/HttpProgressCallback<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic $fileName:Ljava/lang/String;

.field final synthetic $mBleAppFile:I

.field final synthetic $mOpType:I


# direct methods
.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/model/AppStoreFileManager$downloadAppFile$1;->$fileName:Ljava/lang/String;

    iput p2, p0, Lcom/sma/smartv3/model/AppStoreFileManager$downloadAppFile$1;->$mOpType:I

    iput p3, p0, Lcom/sma/smartv3/model/AppStoreFileManager$downloadAppFile$1;->$mBleAppFile:I

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

    const-string v1, "Download error  \n  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public handleProgress(I)V
    .locals 0

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/model/AppStoreFileManager$downloadAppFile$1;->handleResponse(Ljava/lang/String;)V

    return-void
.end method

.method public handleResponse(Ljava/lang/String;)V
    .locals 7

    .line 2
    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    .line 3
    sget-object v0, Lcom/szabh/smable3/BleKey;->APP_FILE:Lcom/szabh/smable3/BleKey;

    new-instance v1, Lcom/szabh/smable3/entity/BleAppFile;

    .line 4
    iget-object v2, p0, Lcom/sma/smartv3/model/AppStoreFileManager$downloadAppFile$1;->$fileName:Ljava/lang/String;

    .line 5
    iget v3, p0, Lcom/sma/smartv3/model/AppStoreFileManager$downloadAppFile$1;->$mOpType:I

    .line 6
    new-instance v4, Ljava/io/File;

    sget-object v5, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v5}, Lcom/android/mltcode/paycertificationapi/uz0;->I0iXXO(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v5

    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lcom/sma/smartv3/model/AppStoreFileManager$downloadAppFile$1;->$fileName:Ljava/lang/String;

    invoke-direct {v4, v5, v6}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v4}, Lcom/android/mltcode/paycertificationapi/iI0OiO;->OX(Ljava/io/File;)[B

    move-result-object v4

    .line 7
    invoke-direct {v1, v2, v3, v4}, Lcom/szabh/smable3/entity/BleAppFile;-><init>(Ljava/lang/String;I[B)V

    .line 8
    invoke-virtual {v1}, Lcom/bestmafen/baseble/data/BleWritable;->toByteArray()[B

    move-result-object v1

    iget v2, p0, Lcom/sma/smartv3/model/AppStoreFileManager$downloadAppFile$1;->$mBleAppFile:I

    .line 9
    invoke-virtual {p1, v0, v1, v2}, Lcom/szabh/smable3/component/BleConnector;->sendStream(Lcom/szabh/smable3/BleKey;[BI)Z

    return-void
.end method
