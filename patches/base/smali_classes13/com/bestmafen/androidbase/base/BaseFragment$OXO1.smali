.class public final Lcom/bestmafen/androidbase/base/BaseFragment$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bestmafen/androidbase/base/BaseFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "OXO1"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBaseFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseFragment.kt\ncom/bestmafen/androidbase/base/BaseFragment$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,119:1\n99#1,3:121\n1#2:120\n*S KotlinDebug\n*F\n+ 1 BaseFragment.kt\ncom/bestmafen/androidbase/base/BaseFragment$Companion\n*L\n115#1:121,3\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBaseFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseFragment.kt\ncom/bestmafen/androidbase/base/BaseFragment$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,119:1\n99#1,3:121\n1#2:120\n*S KotlinDebug\n*F\n+ 1 BaseFragment.kt\ncom/bestmafen/androidbase/base/BaseFragment$Companion\n*L\n115#1:121,3\n*E\n"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseFragment$OXO1;-><init>()V

    return-void
.end method

.method public static synthetic XO0O10(Lcom/bestmafen/androidbase/base/BaseFragment$OXO1;Ljava/lang/String;Ljava/lang/Integer;Landroid/os/Parcelable;Ljava/io/Serializable;ILjava/lang/Object;)Lcom/bestmafen/androidbase/base/BaseFragment;
    .locals 0

    and-int/lit8 p0, p5, 0x1

    const/4 p6, 0x0

    if-eqz p0, :cond_0

    move-object p1, p6

    :cond_0
    and-int/lit8 p0, p5, 0x2

    if-eqz p0, :cond_1

    move-object p2, p6

    :cond_1
    and-int/lit8 p0, p5, 0x4

    if-eqz p0, :cond_2

    move-object p3, p6

    :cond_2
    and-int/lit8 p0, p5, 0x8

    if-eqz p0, :cond_3

    move-object p4, p6

    :cond_3
    new-instance p0, Landroid/os/Bundle;

    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    const-string p5, "mArg0"

    invoke-virtual {p0, p5, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p1

    const-string p2, "mArg1"

    invoke-virtual {p0, p2, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_4
    const-string p1, "mArg2"

    invoke-virtual {p0, p1, p3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string p1, "mArg3"

    invoke-virtual {p0, p1, p4}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    const/4 p1, 0x4

    const-string p2, "T"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->OX(ILjava/lang/String;)V

    const-class p1, Lcom/bestmafen/androidbase/base/BaseFragment;

    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/bestmafen/androidbase/base/BaseFragment;

    invoke-virtual {p1, p0}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    const/4 p0, 0x1

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->OX(ILjava/lang/String;)V

    return-object p1
.end method

.method public static synthetic iO(Lcom/bestmafen/androidbase/base/BaseFragment$OXO1;Landroid/os/Bundle;ILjava/lang/Object;)Lcom/bestmafen/androidbase/base/BaseFragment;
    .locals 0

    const/4 p0, 0x1

    and-int/2addr p2, p0

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    const/4 p2, 0x4

    const-string p3, "T"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->OX(ILjava/lang/String;)V

    const-class p2, Lcom/bestmafen/androidbase/base/BaseFragment;

    invoke-virtual {p2}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/bestmafen/androidbase/base/BaseFragment;

    invoke-virtual {p2, p1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    invoke-static {p0, p3}, Lkotlin/jvm/internal/Intrinsics;->OX(ILjava/lang/String;)V

    return-object p2
.end method


# virtual methods
.method public final synthetic OXO1(Landroid/os/Bundle;)Lcom/bestmafen/androidbase/base/BaseFragment;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/bestmafen/androidbase/base/BaseFragment;",
            ">(",
            "Landroid/os/Bundle;",
            ")TT;"
        }
    .end annotation

    const/4 v0, 0x4

    const-string v1, "T"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->OX(ILjava/lang/String;)V

    const-class v0, Lcom/bestmafen/androidbase/base/BaseFragment;

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bestmafen/androidbase/base/BaseFragment;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    const/4 p1, 0x1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->OX(ILjava/lang/String;)V

    return-object v0
.end method

.method public final synthetic XIi00iiXO(Ljava/lang/String;Ljava/lang/Integer;Landroid/os/Parcelable;Ljava/io/Serializable;)Lcom/bestmafen/androidbase/base/BaseFragment;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/bestmafen/androidbase/base/BaseFragment;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Landroid/os/Parcelable;",
            "Ljava/io/Serializable;",
            ")TT;"
        }
    .end annotation

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "mArg0"

    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p1

    const-string p2, "mArg1"

    invoke-virtual {v0, p2, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_0
    const-string p1, "mArg2"

    invoke-virtual {v0, p1, p3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string p1, "mArg3"

    invoke-virtual {v0, p1, p4}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    const/4 p1, 0x4

    const-string p2, "T"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->OX(ILjava/lang/String;)V

    const-class p1, Lcom/bestmafen/androidbase/base/BaseFragment;

    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/bestmafen/androidbase/base/BaseFragment;

    invoke-virtual {p1, v0}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    const/4 p3, 0x1

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->OX(ILjava/lang/String;)V

    return-object p1
.end method
