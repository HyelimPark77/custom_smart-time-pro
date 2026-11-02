.class public final Lcom/sma/smartv3/ui/me/DeveloperGoMoreSetStartActivity$getGoMoreAuthKey$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/me/DeveloperGoMoreSetStartActivity;->getGoMoreAuthKey(Ljava/lang/String;ILjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
        "Lcom/google/gson/JsonObject;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/me/DeveloperGoMoreSetStartActivity;

.field public final synthetic XIi00iiXO:Ljava/lang/String;

.field public final synthetic XO0O10:Ljava/lang/String;

.field public final synthetic iO:I


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/me/DeveloperGoMoreSetStartActivity;Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperGoMoreSetStartActivity$getGoMoreAuthKey$1;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperGoMoreSetStartActivity;

    iput-object p2, p0, Lcom/sma/smartv3/ui/me/DeveloperGoMoreSetStartActivity$getGoMoreAuthKey$1;->XIi00iiXO:Ljava/lang/String;

    iput p3, p0, Lcom/sma/smartv3/ui/me/DeveloperGoMoreSetStartActivity$getGoMoreAuthKey$1;->iO:I

    iput-object p4, p0, Lcom/sma/smartv3/ui/me/DeveloperGoMoreSetStartActivity$getGoMoreAuthKey$1;->XO0O10:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Lcom/google/gson/JsonObject;)V
    .locals 11

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getGoMoreAuthKey -> "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    if-eqz p1, :cond_0

    :try_start_0
    const-string v0, "key"

    invoke-virtual {p1, v0}, Lcom/google/gson/JsonObject;->get(Ljava/lang/String;)Lcom/google/gson/JsonElement;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperGoMoreSetStartActivity$getGoMoreAuthKey$1;->XIi00iiXO:Ljava/lang/String;

    iget v1, p0, Lcom/sma/smartv3/ui/me/DeveloperGoMoreSetStartActivity$getGoMoreAuthKey$1;->iO:I

    iget-object v2, p0, Lcom/sma/smartv3/ui/me/DeveloperGoMoreSetStartActivity$getGoMoreAuthKey$1;->XO0O10:Ljava/lang/String;

    new-instance v6, Lcom/szabh/smable3/entity/BleGoMoreSettings;

    invoke-direct {v6, v0, p1, v1, v2}, Lcom/szabh/smable3/entity/BleGoMoreSettings;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    sget-object v3, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v4, Lcom/szabh/smable3/BleKey;->GOMORE_SET:Lcom/szabh/smable3/BleKey;

    sget-object v5, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v9, 0x18

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v3 .. v10}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    move-object p1, v0

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getGoMoreAuthKey -> GoMore activate error! "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperGoMoreSetStartActivity$getGoMoreAuthKey$1;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperGoMoreSetStartActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperGoMoreSetStartActivity;->access$reStart(Lcom/sma/smartv3/ui/me/DeveloperGoMoreSetStartActivity;)V

    :cond_0
    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 3

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getGoMoreAuthKey -> GoMore activate error! "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperGoMoreSetStartActivity$getGoMoreAuthKey$1;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperGoMoreSetStartActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperGoMoreSetStartActivity;->access$reStart(Lcom/sma/smartv3/ui/me/DeveloperGoMoreSetStartActivity;)V

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/gson/JsonObject;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/me/DeveloperGoMoreSetStartActivity$getGoMoreAuthKey$1;->OXO1(Lcom/google/gson/JsonObject;)V

    return-void
.end method
