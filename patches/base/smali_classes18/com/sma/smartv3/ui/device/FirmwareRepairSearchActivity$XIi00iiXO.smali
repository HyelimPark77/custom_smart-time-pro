.class public final Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity$XIi00iiXO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/i1OIOOIiX;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFirmwareRepairSearchActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirmwareRepairSearchActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairSearchActivity$mScanner$2$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,170:1\n1011#2,2:171\n*S KotlinDebug\n*F\n+ 1 FirmwareRepairSearchActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairSearchActivity$mScanner$2$2\n*L\n67#1:171,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFirmwareRepairSearchActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirmwareRepairSearchActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairSearchActivity$mScanner$2$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,170:1\n1011#2,2:171\n*S KotlinDebug\n*F\n+ 1 FirmwareRepairSearchActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairSearchActivity$mScanner$2$2\n*L\n67#1:171,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Z)V
    .locals 0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;->access$onScanStarted(Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;)V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;->access$onScanStopped(Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;)V

    return-void
.end method

.method public XIi00iiXO(Lcom/bestmafen/baseble/scanner/BleDevice;)V
    .locals 5

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/sma/smartv3/util/UtilsKt;->XXiIiX10(Lcom/bestmafen/baseble/scanner/BleDevice;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p1}, Lcom/sma/smartv3/util/UtilsKt;->X00Xi1X(Lcom/bestmafen/baseble/scanner/BleDevice;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/bestmafen/baseble/scanner/BleDevice;->getMName()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;->access$getMDeviceInfo$p(Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;)Lcom/szabh/smable3/entity/BleDeviceInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleDeviceInfo;->getMBleName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v1, v4, v2, v3}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;->access$getMList(Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;->access$getMListView(Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;)Landroid/widget/ListView;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;->access$getTvSearchTip(Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;->access$getLlSearchAgain(Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;->access$getMList(Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;->access$getMList(Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    new-instance v0, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity$XIi00iiXO$OXO1;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity$XIi00iiXO$OXO1;-><init>()V

    invoke-static {p1, v0}, Lcom/android/mltcode/paycertificationapi/XiX0OOXI0;->XOXiX0(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;->access$getMListAdapter(Lcom/sma/smartv3/ui/device/FirmwareRepairSearchActivity;)Lcom/android/mltcode/paycertificationapi/XII0Oi10O;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    :cond_2
    :goto_0
    return-void
.end method

.method public iO()V
    .locals 0

    return-void
.end method
