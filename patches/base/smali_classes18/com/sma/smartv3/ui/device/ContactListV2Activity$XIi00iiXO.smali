.class public final Lcom/sma/smartv3/ui/device/ContactListV2Activity$XIi00iiXO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/ContactListV2Activity;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 ContactListV2Activity.kt\ncom/sma/smartv3/ui/device/ContactListV2Activity\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 5 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,82:1\n286#2:83\n287#2,5:87\n774#3:84\n865#3,2:85\n59#4:92\n62#5:93\n*S KotlinDebug\n*F\n+ 1 ContactListV2Activity.kt\ncom/sma/smartv3/ui/device/ContactListV2Activity\n*L\n286#1:84\n286#1:85,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 ContactListV2Activity.kt\ncom/sma/smartv3/ui/device/ContactListV2Activity\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 5 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,82:1\n286#2:83\n287#2,5:87\n774#3:84\n865#3,2:85\n59#4:92\n62#5:93\n*S KotlinDebug\n*F\n+ 1 ContactListV2Activity.kt\ncom/sma/smartv3/ui/device/ContactListV2Activity\n*L\n286#1:84\n286#1:85,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic IO:Lcom/sma/smartv3/ui/device/ContactListV2Activity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/ContactListV2Activity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/ContactListV2Activity$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/device/ContactListV2Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 8

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ContactListV2Activity$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/device/ContactListV2Activity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/ContactListV2Activity;->access$getMList$p(Lcom/sma/smartv3/ui/device/ContactListV2Activity;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/sma/smartv3/ui/contactpicker/ContactResult;

    invoke-virtual {v3}, Lcom/sma/smartv3/ui/contactpicker/ContactResult;->getDisplayName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "getDisplayName(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static {v3, v4, v7, v5, v6}, Lkotlin/text/StringsKt__StringsKt;->iIi011O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/ContactListV2Activity$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/device/ContactListV2Activity;

    invoke-static {v1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->OO0Oi10(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/device/ContactListV2Activity;->showData(Ljava/util/List;)V

    :cond_2
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method
