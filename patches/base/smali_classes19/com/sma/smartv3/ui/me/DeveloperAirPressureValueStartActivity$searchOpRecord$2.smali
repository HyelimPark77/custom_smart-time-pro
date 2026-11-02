.class public final Lcom/sma/smartv3/ui/me/DeveloperAirPressureValueStartActivity$searchOpRecord$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/me/DeveloperAirPressureValueStartActivity;->searchOpRecord(Lcom/bestmafen/baseble/scanner/BleDevice;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
        "[",
        "Lcom/sma/smartv3/model/BleOpRecord;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDeveloperAirPressureValueStartActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperAirPressureValueStartActivity.kt\ncom/sma/smartv3/ui/me/DeveloperAirPressureValueStartActivity$searchOpRecord$2\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,482:1\n19#2:483\n15#2:484\n11#2,2:485\n19#2:487\n15#2:488\n*S KotlinDebug\n*F\n+ 1 DeveloperAirPressureValueStartActivity.kt\ncom/sma/smartv3/ui/me/DeveloperAirPressureValueStartActivity$searchOpRecord$2\n*L\n355#1:483\n355#1:484\n357#1:485,2\n359#1:487\n359#1:488\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDeveloperAirPressureValueStartActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperAirPressureValueStartActivity.kt\ncom/sma/smartv3/ui/me/DeveloperAirPressureValueStartActivity$searchOpRecord$2\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,482:1\n19#2:483\n15#2:484\n11#2,2:485\n19#2:487\n15#2:488\n*S KotlinDebug\n*F\n+ 1 DeveloperAirPressureValueStartActivity.kt\ncom/sma/smartv3/ui/me/DeveloperAirPressureValueStartActivity$searchOpRecord$2\n*L\n355#1:483\n355#1:484\n357#1:485,2\n359#1:487\n359#1:488\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/bestmafen/baseble/scanner/BleDevice;

.field public final synthetic XIi00iiXO:Lcom/sma/smartv3/ui/me/DeveloperAirPressureValueStartActivity;


# direct methods
.method public constructor <init>(Lcom/bestmafen/baseble/scanner/BleDevice;Lcom/sma/smartv3/ui/me/DeveloperAirPressureValueStartActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperAirPressureValueStartActivity$searchOpRecord$2;->OXO1:Lcom/bestmafen/baseble/scanner/BleDevice;

    iput-object p2, p0, Lcom/sma/smartv3/ui/me/DeveloperAirPressureValueStartActivity$searchOpRecord$2;->XIi00iiXO:Lcom/sma/smartv3/ui/me/DeveloperAirPressureValueStartActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1([Lcom/sma/smartv3/model/BleOpRecord;)V
    .locals 7

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_4

    array-length p1, p1

    if-nez p1, :cond_0

    goto/16 :goto_2

    :cond_0
    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v2

    new-instance v3, Lcom/android/mltcode/paycertificationapi/OOi001IXO;

    invoke-direct {v3, v1, v0, v1}, Lcom/android/mltcode/paycertificationapi/OOi001IXO;-><init>(Ljava/util/ArrayList;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Lcom/google/gson/Gson;

    invoke-direct {v4}, Lcom/google/gson/Gson;-><init>()V

    const-class v5, Lcom/android/mltcode/paycertificationapi/OOi001IXO;

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2, v5}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    move-object v3, v2

    :goto_0
    check-cast v3, Lcom/android/mltcode/paycertificationapi/OOi001IXO;

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/OOi001IXO;->XO0O10()Ljava/util/ArrayList;

    move-result-object v2

    iget-object v4, p0, Lcom/sma/smartv3/ui/me/DeveloperAirPressureValueStartActivity$searchOpRecord$2;->XIi00iiXO:Lcom/sma/smartv3/ui/me/DeveloperAirPressureValueStartActivity;

    invoke-static {v4}, Lcom/sma/smartv3/ui/me/DeveloperAirPressureValueStartActivity;->access$getDeviceAddress$p(Lcom/sma/smartv3/ui/me/DeveloperAirPressureValueStartActivity;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    new-instance v6, Lcom/google/gson/Gson;

    invoke-direct {v6}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v6, v3}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v4, v3}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/sma/smartv3/ui/me/DeveloperAirPressureValueStartActivity$searchOpRecord$2;->XIi00iiXO:Lcom/sma/smartv3/ui/me/DeveloperAirPressureValueStartActivity;

    invoke-static {v2}, Lcom/sma/smartv3/ui/me/DeveloperAirPressureValueStartActivity;->access$getTvAlreadyAirPressureValue(Lcom/sma/smartv3/ui/me/DeveloperAirPressureValueStartActivity;)Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    new-instance v3, Lcom/android/mltcode/paycertificationapi/OOi001IXO;

    invoke-direct {v3, v1, v0, v1}, Lcom/android/mltcode/paycertificationapi/OOi001IXO;-><init>(Ljava/util/ArrayList;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, v5}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    move-object v3, p1

    :goto_1
    check-cast v3, Lcom/android/mltcode/paycertificationapi/OOi001IXO;

    invoke-virtual {v3}, Lcom/android/mltcode/paycertificationapi/OOi001IXO;->XO0O10()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperAirPressureValueStartActivity$searchOpRecord$2;->XIi00iiXO:Lcom/sma/smartv3/ui/me/DeveloperAirPressureValueStartActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/me/DeveloperAirPressureValueStartActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/me/DeveloperAirPressureValueStartActivity;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperAirPressureValueStartActivity$searchOpRecord$2;->OXO1:Lcom/bestmafen/baseble/scanner/BleDevice;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " searchOpRecord -> skip device -> "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperAirPressureValueStartActivity$searchOpRecord$2;->XIi00iiXO:Lcom/sma/smartv3/ui/me/DeveloperAirPressureValueStartActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperAirPressureValueStartActivity;->access$getMLoadingPopup$p(Lcom/sma/smartv3/ui/me/DeveloperAirPressureValueStartActivity;)Lcom/android/mltcode/paycertificationapi/uq;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_3
    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperAirPressureValueStartActivity$searchOpRecord$2;->XIi00iiXO:Lcom/sma/smartv3/ui/me/DeveloperAirPressureValueStartActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperAirPressureValueStartActivity;->access$getEtOldBleName(Lcom/sma/smartv3/ui/me/DeveloperAirPressureValueStartActivity;)Landroid/widget/EditText;

    move-result-object v0

    const-string v1, "access$getEtOldBleName(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/me/DeveloperAirPressureValueStartActivity;->startSearch(Landroid/view/View;)V

    return-void

    :cond_4
    :goto_2
    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v2, p0, Lcom/sma/smartv3/ui/me/DeveloperAirPressureValueStartActivity$searchOpRecord$2;->OXO1:Lcom/bestmafen/baseble/scanner/BleDevice;

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static {p1, v2, v3, v4, v1}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->setBleDevice$default(Lcom/bestmafen/baseble/connector/AbsBleConnector;Lcom/bestmafen/baseble/scanner/BleDevice;IILjava/lang/Object;)Lcom/bestmafen/baseble/connector/AbsBleConnector;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->connect(Z)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperAirPressureValueStartActivity$searchOpRecord$2;->XIi00iiXO:Lcom/sma/smartv3/ui/me/DeveloperAirPressureValueStartActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/me/DeveloperAirPressureValueStartActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/me/DeveloperAirPressureValueStartActivity;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperAirPressureValueStartActivity$searchOpRecord$2;->OXO1:Lcom/bestmafen/baseble/scanner/BleDevice;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " searchOpRecord -> connect new device -> "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 4

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperAirPressureValueStartActivity$searchOpRecord$2;->OXO1:Lcom/bestmafen/baseble/scanner/BleDevice;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p1, v0, v3, v1, v2}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->setBleDevice$default(Lcom/bestmafen/baseble/connector/AbsBleConnector;Lcom/bestmafen/baseble/scanner/BleDevice;IILjava/lang/Object;)Lcom/bestmafen/baseble/connector/AbsBleConnector;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->connect(Z)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperAirPressureValueStartActivity$searchOpRecord$2;->XIi00iiXO:Lcom/sma/smartv3/ui/me/DeveloperAirPressureValueStartActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/me/DeveloperAirPressureValueStartActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/me/DeveloperAirPressureValueStartActivity;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperAirPressureValueStartActivity$searchOpRecord$2;->OXO1:Lcom/bestmafen/baseble/scanner/BleDevice;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " searchOpRecord -> error, connect new device -> "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, [Lcom/sma/smartv3/model/BleOpRecord;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/me/DeveloperAirPressureValueStartActivity$searchOpRecord$2;->OXO1([Lcom/sma/smartv3/model/BleOpRecord;)V

    return-void
.end method
