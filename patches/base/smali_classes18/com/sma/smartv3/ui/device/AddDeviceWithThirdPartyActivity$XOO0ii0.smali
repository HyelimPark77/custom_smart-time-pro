.class public final Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$XOO0ii0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/i1OIOOIiX;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAddDeviceWithThirdPartyActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddDeviceWithThirdPartyActivity.kt\ncom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$mScanner$2$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,730:1\n1011#2,2:731\n*S KotlinDebug\n*F\n+ 1 AddDeviceWithThirdPartyActivity.kt\ncom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$mScanner$2$2\n*L\n163#1:731,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAddDeviceWithThirdPartyActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddDeviceWithThirdPartyActivity.kt\ncom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$mScanner$2$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,730:1\n1011#2,2:731\n*S KotlinDebug\n*F\n+ 1 AddDeviceWithThirdPartyActivity.kt\ncom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$mScanner$2$2\n*L\n163#1:731,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$XOO0ii0;->OXO1:Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Z)V
    .locals 0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$XOO0ii0;->OXO1:Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->access$onScanStarted(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$XOO0ii0;->OXO1:Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->access$onScanStopped(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)V

    return-void
.end method

.method public XIi00iiXO(Lcom/bestmafen/baseble/scanner/BleDevice;)V
    .locals 2

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$XOO0ii0;->OXO1:Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->access$getMList(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$XOO0ii0;->OXO1:Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->access$getMCacheSortByList$p(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$XOO0ii0;->OXO1:Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->access$getMCacheSortByList$p(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$XOO0ii0;->OXO1:Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->access$getMCacheSortByList$p(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    new-instance v0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$XOO0ii0$OXO1;

    invoke-direct {v0}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$XOO0ii0$OXO1;-><init>()V

    invoke-static {p1, v0}, Lcom/android/mltcode/paycertificationapi/XiX0OOXI0;->XOXiX0(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$XOO0ii0;->OXO1:Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->access$getMList(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->clear()V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$XOO0ii0;->OXO1:Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->access$getMList(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$XOO0ii0;->OXO1:Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->access$getMCacheSortByList$p(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {p1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity$XOO0ii0;->OXO1:Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;->access$getMListAdapter(Lcom/sma/smartv3/ui/device/AddDeviceWithThirdPartyActivity;)Lcom/android/mltcode/paycertificationapi/XII0Oi10O;

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
